package com.myjava.chainstore2;

public class Store3 extends HeadQuaterStore{

	public Store3() {
	
	}

	@Override
	public void orderKimchiJJige() {
		System.out.println("김치찌게 : 6,000원 입니다.");
	}

	@Override
	public void orderDoenjangJJige() {
		System.out.println("된장찌게 : 6,000원 입니다.");
	}

	@Override
	public void orderBibimBap() {
		System.out.println("비빔밥 : 7,000원 입니다.");
	}

	@Override
	public void orderGongiBap() {
		System.out.println("공기밥 : 1,000원입니다.");
	}

}
