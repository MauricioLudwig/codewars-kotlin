package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SquareNSumTest {
    @ParameterizedTest
    @MethodSource("sample")
    fun shouldTestKata(arrange: Array<Int>, expectation: Int) {
        assertEquals(expectation, squareSum(arrange))
    }

    companion object {
        @JvmStatic
        fun sample(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(arrayOf(1,2), 5),
                Arguments.of(arrayOf(0,3,4,5),50),
                Arguments.of(arrayOf<Int>(), 0),
                Arguments.of(arrayOf(1,2,2), 9)
            )
        }
    }
}

