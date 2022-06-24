package com.myjava.chainstore;

public class Store2 extends HeadQuaterStore {
	@Override
	public void orderKimchiJJige() {
		System.out.println("김치찌게 : 5,000원 입니다.");
	}

	@Override
	public void orderBibimBap() {
		System.out.println("비빔밥 : 5,000원 입니다.");
	}

	@Override
	public void orderGongiBap() {
		System.out.println("공기밥 : 무료 입니다.");
	}
}
