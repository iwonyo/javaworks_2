package chapter7;

public class ArrayQ4 {

	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("사랑", "진도개1");
		dogArray[1] = new Dog("행복", "진도개2");
		dogArray[2] = new Dog("지혜", "진도개3");
		dogArray[3] = new Dog("기쁨", "진도개4");
		dogArray[4] = new Dog("희망", "진도개5");
		
		for(int i=0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println("===향상된 for====");
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}

}
