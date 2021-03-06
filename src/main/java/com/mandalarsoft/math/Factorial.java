package com.mandalarsoft.math;

import java.util.stream.LongStream;

public class Factorial {

	public long of(long number) {
		return range(number, 0);
	}

	public long range(long number, long limit) {
		if (number < 1)
			return 0;
		return LongStream.rangeClosed(limit + 1, number).reduce((a,b) -> a * b).getAsLong();
	}

}
