package chapter7.q5;

import java.util.ArrayList;

import chapter7.q4.Dog;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		Dog dog1 = new Dog();
		dog1.setName("¹é±¸");
		dog1.setType("Áøµ¾°³");
		Dog dog2 = new Dog();
		dog2.setName("Â¯");
		dog2.setType("ºÒµ¶");
		Dog dog3 = new Dog();
		dog3.setName("±æµ¿");
		dog3.setType("»ð»ì°³");
		Dog dog4 = new Dog();
		dog4.setName("¿¤»ç");
		dog4.setType("Çªµé");
		Dog dog5 = new Dog();
		dog5.setName("°ËµÕÀÌ");
		dog5.setType("½ÃÃò");
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
		dogList.add(dog5);
		
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		System.out.println("===Çâ»óµÈ for===");
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}

	}

}
