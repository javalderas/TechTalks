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
}
