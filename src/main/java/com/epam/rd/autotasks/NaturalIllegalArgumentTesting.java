package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NaturalIllegalArgumentTesting {

	Natural natural = new Natural();

	@Test
	void testNegativeInput() {
		assertThrows(IllegalArgumentException.class, () -> natural.isPrime(-1));
		assertThrows(IllegalArgumentException.class, () -> natural.isPrime(-10));
		assertThrows(IllegalArgumentException.class, () -> natural.isPrime(Integer.MIN_VALUE));
	}
}