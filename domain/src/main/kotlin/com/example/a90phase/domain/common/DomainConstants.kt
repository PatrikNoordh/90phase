package com.example.a90phase.domain.common

object DomainConstants {
    const val CYCLE_DURATION_MINUTES = 90
    const val SLEEP_LATENCY_MINUTES = 15
    val PREFERRED_CYCLE_COUNTS = listOf(6, 5, 4)

    const val MIN_CYCLE_DURATION = 70
    const val MAX_CYCLE_DURATION = 110
    const val MIN_SLEEP_LATENCY = 5
    const val MAX_SLEEP_LATENCY = 45

    /**
     * How long after the wake time the morning rating notification arrives.
     *
     * Lives here because the onboarding copy tells the user this number. Keeping it in the
     * scheduler alone would let the promise and the schedule drift apart silently.
     */
    const val MORNING_RATING_DELAY_MINUTES = 15

    const val MIN_RATING = 1
    const val MAX_RATING = 5
    const val MIN_CYCLE_COUNT = 3
    const val MAX_CYCLE_COUNT = 8
}
