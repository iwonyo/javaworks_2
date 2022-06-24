package chapter2;

public class TypeConversion {

	public static void main(String[] args) {
		//묵시적 형 변환
		int iNum = 20;
		float fNum = iNum;
		System.out.println(iNum);  //20
		System.out.println(fNum);  //20.0
		
		double dNum;
		dNum = iNum + fNum;
		System.out.println(dNum);  //40.0
		
		//명시적 형변환
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; 
		int iNum4 = (int)(dNum1 + fNum2);     
		System.out.println(iNum3);   //1
		System.out.println(iNum4);   //2
	}
}
