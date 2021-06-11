package com.mandalarsoft.math;

import java.util.stream.LongStream;

@Deprecated
public class PascalTrangleLegacy {

	protected final Factorial factorial;

	public PascalTrangleLegacy() {
		this.factorial = new Factorial();
	}

	public long[] postiveRoleOf(int role) {
		return LongStream.rangeClosed(0, role).map(x -> postiveRoleOf(role, (int) x)).toArray();
	}

	public long postiveRoleOf(int n, int r) {
		if (r == 0)
			return 1;
		return factorial.range(n, n - r) / factorial.of(r);
	}

	public long negativeRoleof(int n, int r) {
		if (r == 0)
			return 1;
		final long numerator = LongStream.range(1, r).reduce(n, (a, b) -> a * (n - b));
		return numerator / factorial.of(r);
	}

	public long[] negativeRoleof(int n) {
		return LongStream.range(0, 10).map(x -> negativeRoleof(n, (int) x)).toArray();
	}

}