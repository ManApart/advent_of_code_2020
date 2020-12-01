import kotlin.test.Test
import kotlin.test.assertEquals

class SumMultiplierTest {

    @Test
    fun findSimpleSum() {
        val actual = findSumMultiplier(2, listOf(1, 1))
        assertEquals(listOf(1, 1), actual)
    }

    @Test
    fun findSumFromListOfThree() {
        val actual = findSumMultiplier(2, listOf(1, 1, 2))
        assertEquals(listOf(1, 1), actual)
    }

    @Test
    fun findSumOfThree() {
        val actual = findSumMultiplier3(9, listOf(3, 3, 3))
        assertEquals(listOf(3, 3, 3), actual)
    }

    @Test
    fun findSumAndMultiply() {
        val numbers = listOf(1721, 979, 366, 299, 675, 1456)
        val actual = findAndMultiply(2020, numbers)

        assertEquals(514579, actual)
    }

    @Test
    fun findSumAndMultiply3() {
        val numbers = listOf(1721, 979, 366, 299, 675, 1456)
        val actual = findAndMultiply3(2020, numbers)

        assertEquals(241861950, actual)
    }


}