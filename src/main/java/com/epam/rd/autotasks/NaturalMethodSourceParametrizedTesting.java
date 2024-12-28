package com.epam.rd.autotasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NaturalMethodSourceParametrizedTesting {

	Natural natural = new Natural();

	@ParameterizedTest
	@MethodSource("testCases")
	void testIsPrime(int in, boolean expected) {
		assertEquals(expected, natural.isPrime(in));
	}

	static Stream<org.junit.jupiter.params.provider.Arguments> testCases() {
		return Stream.of(
				org.junit.jupiter.params.provider.Arguments.of(1, false),
				org.junit.jupiter.params.provider.Arguments.of(2, true),
				org.junit.jupiter.params.provider.Arguments.of(3, true),
				org.junit.jupiter.params.provider.Arguments.of(4, false)
		);
	}
}