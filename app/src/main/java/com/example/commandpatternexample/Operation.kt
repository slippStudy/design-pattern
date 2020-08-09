package com.example.commandpatternexample

/* 전략패턴
*  1. 오브젝트를 분리하고, 클래스 레벨에서는 인터페이스를 통해서만 의존하도록 만든다.
*  2. 확장에 해당하는 변하는 부분을 별도의 클래스로 만들어 추상화된 인터페이스를 통해 위임하는 방식이다.
* */

private interface Operation {
    fun apply(x: Double): Double
}


enum class BasicOperation(private val symbol: String) : Operation {
    PLUS("+") {
        override fun apply(x: Double): Double {
            return x + 1
        }
    },
    MINUS("-") {
        override fun apply(x: Double): Double {
            return x - 1
        }
    },
    TIMES("*") {
        override fun apply(x: Double): Double {
            return x * 2
        }
    },
    DIVIDE("/") {
        override fun apply(x: Double): Double {
            return x / 2
        }
    };

    override fun toString(): String {
        return symbol
    }

}