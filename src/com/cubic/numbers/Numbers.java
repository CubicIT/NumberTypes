package com.cubic.numbers;

public class Numbers {
	public boolean IsPrime(int i) {

		for (int j = 2; j < i; j++) {
			if ((j != 2) && i % j == 0) {
				return false;
			}

		}
		return true;
	}

	public boolean IsEven(int i) {

		if (i % 2 == 0)
			return true;
		return false;
	}

	public boolean IsOdd(int i) {

		if (i % 2 == 0)
			return false;
		return true;
	}

	public int Add(int i, int j) {
		return i + j;

	}

	public int subtract(int i, int j) {
		return i - j;

	}

	public int cube(int i) {
		return i * i * i;
	}

}
