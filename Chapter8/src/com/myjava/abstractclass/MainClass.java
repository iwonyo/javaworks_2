package com.myjava.abstractclass;

public class MainClass {
	public static void main(String[] args) {
		//부모타입으로 자동 형변환
		Animal cat = new Cat();
		cat.breathe();
		cat.cry();
		
		Animal dog = new  Dog();
		dog.breathe();
		dog.cry();
	}
}
