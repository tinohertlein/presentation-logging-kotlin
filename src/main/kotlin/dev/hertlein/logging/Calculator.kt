package dev.hertlein.logging

import java.util.concurrent.TimeUnit

private const val THE_ANSWER = 42
private const val SLEEP_DURATION = 5

object Calculator {

    fun calculateHeavily(duration: Int = SLEEP_DURATION): Int {
        println("----- Start computing heavily -----")

        repeat(duration) {
            print(".")
            TimeUnit.SECONDS.sleep(1)
        }

        println()
        println("----- End computing heavily -----")

        return THE_ANSWER
    }

    fun calculateWithException() {
        throw ArithmeticException("Division by Zero")
    }
}
