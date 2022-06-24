package array.objectarray;

public class ExtendsFor {

	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C++", "JavaScript", "Python"};
		for(String lang : strArray) {
			System.out.println(lang);
		}
		
		int[] intArray = {1, 2, 3, 4, 5};
		for(int number : intArray) {
			System.out.println(number);
		}
	}
}
