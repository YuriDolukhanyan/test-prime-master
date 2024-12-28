package com.epam.rd.autotasks;

public class Natural {
	public boolean isPrime(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative numbers are not allowed!");
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); ++i)
			if (n % i == 0)
				return false;
		return true;
	}
}