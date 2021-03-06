import adapters.findProductOfVoltageCounts
import validNumbers.findAnyContiguousSumAndAddLargestAndSmallest
import java.io.File

fun main() {
//    println(findAndMultiply(2020, 2, parseInputToNumbers(1, 1)))
//    println(findAndMultiply(2020, 3, parseInputToNumbers(1, 1)))
//    println(countValidPasswordsByLetterCount(parseInputToStrings(2, 1)))
//    println(countValidPasswordsByLetterPosition(parseInputToStrings(2, 1)))
//    println(sledding.countTrees(3, -1, sledding.Grid(parseInputToStrings(3, 1))))
//    println(sledding.countTreesForMultiplePaths(sledding.getDay3Paths, sledding.Grid(parseInputToStrings(3, 1))))
//    println(countPassportsWithAllKeys(parseInputToStrings(4, 1)))
//    println(countValidPassports(parseInputToStrings(4, 1)))
//    println(findLargestSeatID(parseBoardingPasses(parseInputToStrings(5, 1))))
//    println(findGapId(parseInputToStrings(5, 1)))
//    println(countAnswersForCustoms(parseInputToStrings(6, 1)))
//    println(countAllAnswersForCustoms(parseInputToStrings(6, 1)))
//    println(parseAndCountLuggageAncestors("shiny gold", parseInputToStrings(7, 1)))
//    println(parseAndCountLuggageDescendants("shiny gold", parseInputToStrings(7, 1)))
//    println(findAccAtLoopStart(parseOperations(parseInputToStrings(8, 1))))
//    println(findAccAtByFiddlingOps(parseOperations(parseInputToStrings(8, 1))))
//    println(findFirstInvalidNumber(25, parseInputToLongs(9, 1)))
//    println(findAnyContiguousSumAndAddLargestAndSmallest(85848519, parseInputToLongs(9, 1)))
    println(findProductOfVoltageCounts(parseInputToNumbers(10, 1)))
}

private fun parseInputToNumbers(day: Int, problem: Int): List<Int> {
    return parseInputToStrings(day, problem).map { it.toInt() }
}

private fun parseInputToLongs(day: Int, problem: Int): List<Long> {
    return parseInputToStrings(day, problem).map { it.toLong() }
}

private fun parseInputToStrings(day: Int, problem: Int): List<String> {
    return File("./input/d${day}p$problem.txt").readLines()
}