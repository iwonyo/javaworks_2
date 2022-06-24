package chapter2;

public class Using_var {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		
		System.out.println(i);
		System.out.println(j);
		
		var str = "smile";
		System.out.println(str);
		
		str = "행복";    //다른 문자열 대입 가능
		System.out.println(str);
	}

}
