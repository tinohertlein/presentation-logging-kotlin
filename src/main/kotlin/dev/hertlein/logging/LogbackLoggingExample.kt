package dev.hertlein.logging

import org.slf4j.LoggerFactory.getLogger

fun main() {
    LogbackLoggingService().execute()
}

class LogbackLoggingService {

    companion object {
        private val logger = getLogger(LogbackLoggingService::class.java)
    }

    fun execute() {
        default()
        withException()
    }

    private fun default() {
        logger.warn("Result of heavy computation is ${Calculator.calculateHeavily()}")
        logger.warn("Result of heavy computation is {}", Calculator.calculateHeavily())
    }

    private fun withException() {
        try {
            Calculator.calculateWithException()
        } catch (exception: ArithmeticException) {
            logger.error("Cannot calculate because of", exception)
        }
    }
}
