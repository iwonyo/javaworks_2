package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		
		Company myCompany2 = Company.getInstance();
		
		//company myCompany3 = new Company();  //error
		
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		
		System.out.println(myCompany1==myCompany2);
		
		//»ç¿ë ¿¹
		Calendar cal = Calendar.getInstance();
	}
}
