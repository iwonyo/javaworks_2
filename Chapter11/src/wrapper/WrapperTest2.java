package wrapper;

public class WrapperTest2 {

	public static void main(String[] args) {
		Integer iValue= new Integer(100);
		int myValue = iValue.intValue();   
		//언박싱(객체형을 기본형으로 꺼내는 것)
		System.out.println(myValue);
		
		//valueOf() 정적 메서드는 정수나 문자열을 Integer로 반환
		Integer number1 = Integer.valueOf("200"); 
		Integer number2 = Integer.valueOf(200);
		System.out.println("number1 :"+number1+", "+"number2 :"+number2);
		
		//parseInt() 정적 메서드는 문자열에서 int값을 가져와서 반환
		int num = Integer.parseInt("1000"); 
		System.out.println(num);

	}

}
