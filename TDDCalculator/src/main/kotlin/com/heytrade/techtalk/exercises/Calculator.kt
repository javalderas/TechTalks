package com.heytrade.techtalk.exercises

class Calculator {
    fun parse(s: String): Int {
        val(a, op, b) = s.split(" ") // <---- EYE LOOK Declaration val!!
        return when (op) {
            "*" ->a.toInt() * b.toInt()
            "/" ->a.toInt() / b.toInt()
            else -> throw IllegalArgumentException("invalid operator")
        }
    }

    // No Corner Cases lost when you use TDD.
}
