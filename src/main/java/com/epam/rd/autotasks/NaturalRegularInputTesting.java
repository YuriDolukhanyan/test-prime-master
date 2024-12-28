package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NaturalRegularInputTesting {

	Natural natural = new Natural();

	@Test
	void testZero() {
		assertFalse(natural.isPrime(0));
	}

	@Test
	void testOne() {
		assertFalse(natural.isPrime(1));
	}

	@Test
	void testSmallPrime() {
		assertTrue(natural.isPrime(7));
	}

	@Test
	void testSmallNonPrime() {
		assertFalse(natural.isPrime(9));
	}

	@Test
	void testLargePrime() {
		assertTrue(natural.isPrime(101));
	}

	@Test
	void testLargeNonPrime() {
		assertFalse(natural.isPrime(100));
	}
}