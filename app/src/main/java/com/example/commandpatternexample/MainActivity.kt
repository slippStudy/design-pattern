package com.example.commandpatternexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.commandpatternexample.databinding.ActivityMainBinding
import kotlinx.coroutines.*

/* 템플릿 메소드 패턴
*
*  1. 상속을 통해 기능을 확장해서 사용
*  2. 변하지 않는 부분은 슈퍼클래스에 두고 변하는 부분은 추상 메소드로 정의해둬서 서브클래스에서 오버라이드하여 새롭게 정의해서 사용한다.
*
* */
abstract class Command {
    abstract fun execute(operation: BasicOperation)
    fun stop(){
        job.cancel()
    }
}

class ControlNumCommand : Command() {
    override fun execute(operation: BasicOperation) {
        job = CoroutineScope(Dispatchers.IO).launch {
            repeat(Int.MAX_VALUE) {
                if(job.isCancelled) return@repeat
                var num = binding.textViewNumber.text.toString().toDouble()
                num = operation.apply(num)
                delay(1000L)
                withContext(Dispatchers.Main) {
                    binding.textViewNumber.text = num.toString()
                }
            }
        }
    }
}


lateinit var binding: ActivityMainBinding
lateinit var job: Job

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var currentOperationType = BasicOperation.PLUS

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initializeButton()
    }

    private fun initializeButton() {
        binding.buttonStart.setOnClickListener(this)
        binding.buttonStop.setOnClickListener(this)
        binding.buttonPlus.setOnClickListener(this)
        binding.buttonMinus.setOnClickListener(this)
        binding.buttonTimes.setOnClickListener(this)
        binding.buttonDiv.setOnClickListener(this)

    }

    private fun showNotice() {
        Toast.makeText(this, "실행 중입니다. 정지하고 다시 시도하세요.", Toast.LENGTH_LONG).show()
    }

    override fun onClick(v: View?) {
        val controlNumCommand: ControlNumCommand = ControlNumCommand()

        when (v?.id) {
            R.id.buttonStart -> {
                controlNumCommand.execute(currentOperationType)
            }

            R.id.buttonStop -> {
                controlNumCommand.stop()
            }

            R.id.buttonPlus -> {
                if (job.isActive) {
                    showNotice()
                    return
                }
                currentOperationType = BasicOperation.PLUS
            }

            R.id.buttonMinus -> {
                if (job.isActive) {
                    showNotice()
                    return
                }
                currentOperationType = BasicOperation.MINUS
            }

            R.id.buttonTimes -> {
                if (job.isActive) {
                    showNotice()
                    return
                }
                currentOperationType = BasicOperation.TIMES
            }

            R.id.buttonDiv -> {
                if (job.isActive) {
                    showNotice()
                    return
                }
                currentOperationType = BasicOperation.DIVIDE
            }
        }
    }
}