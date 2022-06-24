package chapter7.q4;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog();
		dogArray[0].setName("¹é±¸");
		dogArray[0].setType("Áøµ¾°³");
		dogArray[1] = new Dog();
		dogArray[1].setName("Â¯");
		dogArray[1].setType("ºÒµ¶");
		dogArray[2] = new Dog();
		dogArray[2].setName("Çàº¹");
		dogArray[2].setType("Çªµé");
		dogArray[3] = new Dog();
		dogArray[3].setName("»ç¶û");
		dogArray[3].setType("»ð»ì°³");
		dogArray[4] = new Dog();
		dogArray[4].setName("ÇØÇÇ");
		dogArray[4].setType("½ÃÃò");
		
		for(int i=0; i<5; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		System.out.println("=================");
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}

	}

}
