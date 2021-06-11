package com.mandalarsoft.math.domain;

import com.mandalarsoft.math.Factorial;

public abstract class PascalTrangleAbstract<T> implements PascalTrangle<T> {

	protected final Factorial factorial;

	public PascalTrangleAbstract() {
		this.factorial = new Factorial();
	}

}
