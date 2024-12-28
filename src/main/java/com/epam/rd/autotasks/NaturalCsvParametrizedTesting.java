package com.epam.rd.autotasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaturalCsvParametrizedTesting {

	Natural natural = new Natural();

	@ParameterizedTest
	@CsvFileSource(resources = "/primeTest.csv")
	void testCsvParametrizedTesting(int input, boolean expected) {
		assertEquals(expected, natural.isPrime(input),
				() -> "Failed for input: " + input);
	}
}