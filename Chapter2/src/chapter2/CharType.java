package chapter2;

public class CharType {
	public static void main(String[] args) {
		//문자 자료형
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		System.out.println("\n***** 유니코드 *****");
		
		char uniCode1 = '한';
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';
		System.out.println(uniCode2);
		
		for(char c = 97; c < 123; c++) {   //영어 소문자 출력(아스키코드)
			System.out.print(c + " ");
		} 
	}
}
