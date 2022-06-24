package com.myjava.chainstore2;

public class MainClass {
	public static void main(String[] args) {
		HeadQuaterStore store1 = new Store1();
		store1.orderKimchiJJige();
		store1.orderDoenjangJJige();
		store1.orderBibimBap();
		store1.orderGongiBap();
		System.out.println("=======================");
		
		HeadQuaterStore store2 = new Store2();
		store2.orderKimchiJJige();
		store2.orderDoenjangJJige();
		store2.orderBibimBap();
		store2.orderGongiBap();
		System.out.println("=======================");
		
		HeadQuaterStore store3 = new Store3();
		store3.orderKimchiJJige();
		store3.orderDoenjangJJige();
		store3.orderBibimBap();
		store3.orderGongiBap();
	}
}
