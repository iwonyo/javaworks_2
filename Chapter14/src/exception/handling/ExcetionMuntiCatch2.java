package exception.handling;

public class ExcetionMuntiCatch2 {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			
			num[0] = 1;
			num[1] = 2;
			//num[2] = 3;   //ArrayIndexOutOfBoundsException 발생
			
			num[1] = 3/0;  //ArithmeticException 발생
			
			System.out.println("1, 2, 3 저장");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("항상 수행됩니다.");
		}
	}
}
