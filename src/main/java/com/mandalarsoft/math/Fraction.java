package com.mandalarsoft.math;

class Builder {

	private long x;

	public Builder(long x) {
		super();
		this.x = x;
	}

	public Fraction as(long a) {
		return new Fraction(x * a, a);
	}

	public Fraction by(long a) {
		return new Fraction(x, a);
	}

}

public class Fraction {
	private final long numerator, denominator;

	Fraction(Fraction fraction) {
		this(fraction.numerator, fraction.denominator);
	}

	Fraction(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	@Override
	public String toString() {
		return " ( " + numerator + "/" + denominator + " ) ";
	}

	public static Builder of(long x) {
		return new Builder(x);
	}

	public Fraction subtract(long b) {
		return subtract(this, b);
	}

	public Fraction subtract(Fraction b) {
		return subtract(this, b);
	}

	public Fraction addition(long b) {
		return addition(this, b);
	}

	public Fraction addition(Fraction b) {
		return addition(this, b);
	}

	public Fraction multiply(long b) {
		return multiply(this, b);
	}

	public Fraction multiply(Fraction b) {
		return multiply(this, b);
	}

	public Fraction divide(long b) {
		return divide(this, b);
	}

	public Fraction divide(Fraction b) {
		return divide(this, b);
	}

	public Fraction aligment(long b) {
		return aligment(this, b);
	}

	public Fraction simplify() {
		return simplify(this);
	}

	public static Fraction subtract(Fraction a, long b) {
		return subtract(a, Fraction.of(b).as(a.denominator));
	}

	public static Fraction subtract(Fraction a, Fraction b) {
		if (a.denominator != b.denominator) {
			final long aD = a.denominator;
			a = aligment(a, b.denominator);
			b = aligment(b, aD);
		}
		return new Fraction(a.numerator - b.numerator, a.denominator);
	}

	public static Fraction addition(Fraction a, long b) {
		return subtract(a, Fraction.of(b).as(a.denominator));
	}

	public static Fraction addition(Fraction a, Fraction b) {
		if (a.denominator != b.denominator) {
			final long aD = a.denominator;
			a = aligment(a, b.denominator);
			b = aligment(b, aD);
		}
		return new Fraction(a.numerator + b.numerator, a.denominator);
	}

	public static Fraction multiply(Fraction a, Fraction b) {
		return new Fraction(a.numerator * b.numerator, a.denominator * b.denominator);
	}

	public static Fraction multiply(Fraction a, long b) {
		return new Fraction(a.numerator * b, a.denominator);
	}

	public static Fraction divide(Fraction a, long b) {
		return multiply(a, new Fraction(1, b));
	}

	public static Fraction divide(Fraction a, Fraction b) {
		return multiply(a, new Fraction(b.denominator, b.numerator));
	}

	public static Fraction aligment(Fraction a, long base) {
		return new Fraction(a.numerator * base, a.denominator * base);
	}

	public static Fraction simplify(Fraction f) {
		long gcd = GCD.of(f);
		if (gcd != 1)
			return new Fraction(f.numerator / gcd, f.denominator / gcd);
		return f;
	}

}