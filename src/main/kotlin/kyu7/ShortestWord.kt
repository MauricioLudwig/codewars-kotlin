package kyu7

/**
 * @source https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
 */

fun findShort(s: String): Int = s.split(" ").minOfOrNull { it.length } ?: 0