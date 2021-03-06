package validNumbers

import org.testng.Assert.assertTrue
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test
import kotlin.test.assertFalse

class ValidNumberCheckerTest {

    @Test
    fun validValue() {
        val input = listOf(1,2,3).map { it.toLong() }

        assertTrue(isValidNumber(4, input))
        assertTrue(isValidNumber(5, input))
    }

    @Test
    fun validValueWithDifferentLookback() {
        val input = listOf(2,3).map { it.toLong() }

        assertTrue(isValidNumber(5, input))
    }

    @Test
    fun invalidValues() {
        val input = listOf(1,2,3).map { it.toLong() }

        assertFalse(isValidNumber(6, input))
        assertFalse(isValidNumber(2, input), "Can't use duplicate numbers")
    }

    @Test
    fun invalidValuesWithDifferentLookback() {
        val input = listOf(2,3).map { it.toLong() }

        assertFalse(isValidNumber(4, input))
    }

    @Test
    fun findInvalidCase() {
        val input = listOf(0,2,3,4).map { it.toLong() }

        assertEquals(4, findFirstInvalidNumber(3,  input))
    }

    @Test
    fun part1ExampleTest() {
        val input = """
            35
            20
            15
            25
            47
            40
            62
            55
            65
            95
            102
            117
            150
            182
            127
            219
            299
            277
            309
            576
        """.trimIndent().split("\n").map { it.toLong() }

        assertEquals(127, findFirstInvalidNumber(5,  input))
    }

    @Test
    fun findContiguousSumToNumber() {
        val input = listOf(1,2,3,5).map { it.toLong() }

        assertEquals(0..1, findAnyContiguousSum(3,  input))
        assertEquals(1..2, findAnyContiguousSum(5,  input))
        assertEquals(1..3, findAnyContiguousSum(10,  input))
    }

    @Test
    fun findContiguousSumToNumberReversed() {
        val input = listOf(5,3,2,1).map { it.toLong() }

        assertEquals(2..3, findAnyContiguousSum(3,  input))
        assertEquals(1..2, findAnyContiguousSum(5,  input))
        assertEquals(0..2, findAnyContiguousSum(10,  input))
    }

    @Test
    fun findContiguousSumAndAddThem() {
        val input = listOf(1,2,3,5).map { it.toLong() }

        assertEquals(3, findAnyContiguousSumAndAddLargestAndSmallest(3,  input))
        assertEquals(5, findAnyContiguousSumAndAddLargestAndSmallest(5,  input))
        assertEquals(7, findAnyContiguousSumAndAddLargestAndSmallest(10,  input))
    }

    @Test
    fun findContiguousSumAndAddTheSmallestAndLargest() {
        val input = listOf(5,4,3,1,2).map { it.toLong() }

        assertEquals(3, findAnyContiguousSumAndAddLargestAndSmallest(3,  input))
        assertEquals(5, findAnyContiguousSumAndAddLargestAndSmallest(10,  input))
    }

    @Test
    fun findContiguousSumAndAddThemPart2Example() {
        val input = """
            35
            20
            15
            25
            47
            40
            62
            55
            65
            95
            102
            117
            150
            182
            127
            219
            299
            277
            309
            576
        """.trimIndent().split("\n").map { it.toLong() }

        assertEquals(62, findAnyContiguousSumAndAddLargestAndSmallest(127,  input))
    }

}