package com.mandalarsoft.math;

public class Fraction {
	private final int numerator, denominator;

	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public static Builder of(int x) {
		return new Builder(x);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	@Override
	public String toString() {
		return " ( " + numerator + "/" + denominator + " ) ";
	}

	public static Fraction subtract(Fraction a, int b) {
		return subtract(a, Fraction.of(b).as(a.denominator));
	}
	
	public static Fraction subtract(Fraction a, Fraction b) {
		return new Fraction(a.numerator - b.numerator, a.denominator);
	}
	
	public static Fraction aligment(Fraction a, int base) {
		return null;
	}

}

class Builder {

	private int x;

	public Builder(int x) {
		super();
		this.x = x;
	}

	public Fraction as(int a) {
		return new Fraction(x * a, a);
	}

}