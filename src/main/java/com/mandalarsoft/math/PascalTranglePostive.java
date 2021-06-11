package com.mandalarsoft.math;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import com.mandalarsoft.math.domain.PascalTrangleAbstract;

public class PascalTranglePostive extends PascalTrangleAbstract<Long> {

	@Override
	public Long roleOf(Long n, long r) {
		if (r == 0)
			return 1L;
		return factorial.range(n, n - r) / factorial.of(r);
	}

	@Override
	public List<Long> roleOf(Long n) {
		return LongStream.rangeClosed(0, n).map(x -> roleOf(n, x)).boxed().collect(Collectors.toList());
	}

}
