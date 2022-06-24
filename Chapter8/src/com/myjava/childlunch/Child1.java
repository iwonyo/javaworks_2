package com.myjava.childlunch;

public class Child1 extends LunchMenu{

	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}

	@Override
	public int calculating() {
		return rice + bulgogi + banana;
	}
}
