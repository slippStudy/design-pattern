package com.example.commandpatternexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.commandpatternexample.databinding.ActivityMainBinding
import kotlinx.coroutines.*

interface Command {
    fun execute()
    fun stop()
}

lateinit var binding: ActivityMainBinding
lateinit var job: Job

class MainActivity : AppCompatActivity(), Command, View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initializeButton()
    }

    private fun initializeButton() {
        binding.buttonStart.setOnClickListener(this)
        binding.buttonStop.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.buttonStart -> {
                execute()
            }

            R.id.buttonStop -> {
                stop()
            }
        }
    }

    override fun execute() {
        job = CoroutineScope(Dispatchers.IO).launch {
            repeat(Int.MAX_VALUE) {
                var num = binding.textViewNumber.text.toString().toInt()
                num++
                delay(1000L)
                withContext(Dispatchers.Main) {
                    binding.textViewNumber.text = num.toString()
                }
            }
        }
    }

    override fun stop() {
        job.cancel()
    }
}