package dev.hertlein.logging

import java.util.concurrent.TimeUnit

object Calculator {

    fun calculateHeavily(): Int {
        val result = 42
        println("----- Computing heavily -----")
        TimeUnit.SECONDS.sleep(5)
        return result
    }

    fun calculateWithException() {
        throw ArithmeticException("Division by Zero")
    }
}
