package loopexample;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i == 4 || i == 8)
				continue;
			System.out.println(i);
		}

	}
}
