package arraycopy;

public class ArrayCopy2 {

	public static void main(String[] args) {
		String[] str1 = new String[3];
		int i;
		str1[0] = "Java";
		str1[1] = "C++";
		str1[2] = "Python";
		
		for(i=0; i<str1.length; i++) {
			System.out.println(str1[i]);
		}
		System.out.println();
		
		//배열의 복사 - Object클래스의 clone() 메서드
		String[] str2 = str1.clone();
		for(i=0; i<str2.length; i++) {
			System.out.println(str2[i]);
		}
	}
}
