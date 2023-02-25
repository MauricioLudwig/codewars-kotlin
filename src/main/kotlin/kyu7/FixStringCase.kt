package kyu7

/**
 * @source https://www.codewars.com/kata/5b180e9fedaa564a7000009a
 */

object FixStringCase {
    fun solve(s: String): String {
        val arr = s.toCharArray()
        val nrOfLowerCase = arr.filter { it.isLowerCase() }.size
        val nrOfUpperCase = arr.filter { it.isUpperCase() }.size

        return if (nrOfUpperCase > nrOfLowerCase) {
            s.toUpperCase()
        } else {
            s.toLowerCase()
        }
    }
}