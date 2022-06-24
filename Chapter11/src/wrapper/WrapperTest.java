package wrapper;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
	
		for(int i=0; i<numbers.size(); i++) {
			Integer num = numbers.get(i);
			System.out.println(num);
		}

	}

}
