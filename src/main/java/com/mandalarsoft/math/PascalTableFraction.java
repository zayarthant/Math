package com.mandalarsoft.math;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.mandalarsoft.math.domain.PascalTrangleAbstract;

public class PascalTableFraction extends PascalTrangleAbstract<Fraction> {

	@Override
	public Fraction roleOf(Fraction n, long r) {
		if (r == 0)
			return Fraction.of(1).as(1);
		Fraction result = n;
		for (int i = 1; i < r; i++) {
			final Fraction t = Fraction.subtract(n, i);
			result = Fraction.multiply(result, t);
		}
		return Fraction.divide(result, factorial.of(r)).simplify();
	}

	@Override
	public List<Fraction> roleOf(Fraction n) {
		return IntStream.range(0, 10).mapToObj(r -> roleOf(n, r)).collect(Collectors.toList());
	}

}
