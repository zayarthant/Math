package com.mandalarsoft.math;

public class GCD { // GCD - Greatest Common Divisor

	public static long of(long a, long b) {
		a = Math.abs(a);
		b = Math.abs(b);
		long r;
		do {
			r = a - b * (long) Math.floor(a / b);
			if (r == 0)
				break;
			a = b;
			b = r;
		} while (r != 0);
		return b;
	}

	public static long of(Fraction f) {
		return of(f.getNumerator(), f.getDenominator());
	}

	public static long look(long a, long b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	public static long look(Fraction f) {
		return look(f.getNumerator(), f.getDenominator());
	}

}
