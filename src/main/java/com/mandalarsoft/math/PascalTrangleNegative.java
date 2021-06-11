package com.mandalarsoft.math;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import com.mandalarsoft.math.domain.PascalTrangleAbstract;

public class PascalTrangleNegative extends PascalTrangleAbstract<Long> {

	@Override
	public Long roleOf(Long n, long r) {
		if (r == 0)
			return 1L;
		final long numerator = LongStream.range(1, r).reduce(n, (a, b) -> a * (n - b));
		return numerator / factorial.of(r);
	}

	@Override
	public List<Long> roleOf(Long n) {
		return LongStream.range(0, 10).map(x -> roleOf(n, x)).boxed().collect(Collectors.toList());
	}

}
