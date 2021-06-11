package com.mandalarsoft.math;

public class App {
	public static void main(String[] args) {
		Fraction a = new Fraction(2, 3);
		Fraction b = Fraction.of(3).as(3);
		System.out.println(a);
		System.out.println(b);
		Fraction res = Fraction.subtract(a, b);
		System.out.println(res);
	}
}
