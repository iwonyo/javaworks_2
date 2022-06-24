package arraycopy;

public class ArrayCopy0 {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = new int[5];
		int i;
		
		for(i=0; i<array2.length; i++) {
			array2[i] = array1[i];
		}
		
		for(i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("-----------");
		int[] array3 = array2.clone();
		for(i=0; i<array3.length; i++) {
			System.out.println(array3[i]);
		}
		
		System.out.println("-----------");
		//System 클래스의 arraycopy() 메서드
		System.arraycopy(array1, 0, array2, 0, 4);
		for(i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
