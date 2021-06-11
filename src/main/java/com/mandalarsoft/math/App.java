package com.mandalarsoft.math;

import java.util.List;

import com.mandalarsoft.math.domain.PascalTrangle;

public class App {
	public static void main(String[] args) {
		PascalTrangle<Fraction> trangle = new PascalTableFraction();
		List<Fraction> f =  trangle.roleOf(new Fraction(1, 2));
		System.out.println(f);
	}
}
