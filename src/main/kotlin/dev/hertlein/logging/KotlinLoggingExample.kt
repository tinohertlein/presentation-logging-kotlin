package dev.hertlein.logging

import mu.KotlinLogging

fun main() {
    KotlinLoggingService().execute()
}

private val logger = KotlinLogging.logger {}

class KotlinLoggingService {

    fun execute() {
        default()
        withException()
    }

    private fun default() {
        logger.warn { "Result of heavy computation is ${Calculator.calculateHeavily()}" }
    }

    private fun withException() {
        try {
            Calculator.calculateWithException()
        } catch (exception: ArithmeticException) {
            logger.error(exception) { "Cannot calculate because of '$exception'" }
        }
    }
}
