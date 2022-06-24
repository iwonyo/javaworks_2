package streamex;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		//정수 배열에서 스트림 활용하기
		int arr[] = {1, 2, 3, 4, 5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		System.out.println("배열의 합 : " + sum);
		System.out.println("배열 자료의 수 : " + count);
	}
}
