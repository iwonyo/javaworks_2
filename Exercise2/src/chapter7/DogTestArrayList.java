package chapter7;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("사랑","진도개1"));
		dogList.add(new Dog("행복","진도개2"));
		dogList.add(new Dog("지혜","진도개3"));
		dogList.add(new Dog("기쁨","진도개4"));
		dogList.add(new Dog("희망","진도개5"));
		
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		System.out.println("===향상된 for===");
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}

	}

}
