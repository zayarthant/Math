package com.mandalarsoft.math.domain;

import java.util.List;

public interface PascalTrangle<T> {
	
	public T roleOf(T n, long r);
	
	public List<T> roleOf(T n);
}
