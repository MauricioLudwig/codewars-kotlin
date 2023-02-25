package kyu7

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FixStringCaseTest {
    @ParameterizedTest
    @MethodSource("sample")
    fun shouldTestKata(arrange: String, expectation: String) {
        assertEquals(expectation, FixStringCase.solve(arrange))
    }

    companion object {
        @JvmStatic
        fun sample(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("code", "code"),
                Arguments.of("CODe", "CODE"),
                Arguments.of("COde", "code"),
                Arguments.of("Code", "code"),
                Arguments.of("", "")
            )
        }
    }
}