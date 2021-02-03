package com.heytrade.techtalk.exercises

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

// RED - GREEN - BLUE (refactor)
class CalculatorTest {

    @Test
    fun testMultiply2by2() {
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4, result)
    }

    @Test
    fun testDivide2By2() {
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1, result)
    }

    /**
     *  Why use <internal> word? when execute no test on windows selected. Why?
    @Test
    internal fun testMultiply2by2() {
    val calculator = Calculator()
    val result = calculator.parse("2 * 2")
    assertEquals(4, result)
    }*/
}
