package password

data class PasswordAttempt(val letter: Char, val min: Int, val max: Int, val phrase: String) {
    fun isValidByCount(): Boolean {
        val count = phrase.count { it == letter }
        return count in min..max
    }

    fun isValidByPosition(): Boolean {
        if (min > phrase.length || max > phrase.length){
            return false
        }

        val minMatch = phrase[min-1] == letter
        val maxMatch = phrase[max-1] == letter

        return (minMatch != maxMatch) && (minMatch || maxMatch)
    }
}

fun String.toPasswordAttempt(): PasswordAttempt {
    val halves = this.split(":")
    val phrase = halves.last().trim()

    val requirements = halves.first().split(" ")
    val letter = requirements.last().last()

    val range = requirements.first().split("-")
    val min = range.first().toInt()
    val max = range.last().toInt()

    return PasswordAttempt(letter, min, max, phrase)
}