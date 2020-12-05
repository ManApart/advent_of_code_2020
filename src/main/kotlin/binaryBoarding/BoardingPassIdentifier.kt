package binaryBoarding

import findNumber

fun findLargestSeatID(pickLargerSteps: List<List<Boolean>>): Int {
    return pickLargerSteps.map { identifySeatID(it) }.maxOrNull() ?: 0
}

fun identifySeatID(pickLargerSteps: List<Boolean>): Int {
    val row = findNumber(0, 127, pickLargerSteps.subList(0, 7))
    val column = findNumber(0, 7, pickLargerSteps.subList(7, 10))

    return row * 8 + column
}