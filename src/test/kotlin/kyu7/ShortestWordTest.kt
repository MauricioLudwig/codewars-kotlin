package kyu7

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ShortestWordTest {
    @ParameterizedTest
    @MethodSource("sample")
    fun shouldTestKata(arrange: String, expectation: Int) {
        assertEquals(expectation, findShort(arrange))
    }

    companion object {
        @JvmStatic
        fun sample(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("bitcoin take over the world maybe who knows perhaps", 3),
                Arguments.of("turns out random test cases are easier than writing out basic ones", 3),
                Arguments.of("Let's travel abroad shall we", 2)
            )
        }
    }
}