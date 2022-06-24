package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		int i;
		
		alphabets[0]  = ch;
		System.out.println(alphabets[0]);
		alphabets[1] = (char) (ch+1);
		System.out.println(alphabets[1]);
		
		for(i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		for(i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]+","+ (int)alphabets[i]);
		}
	}
}
