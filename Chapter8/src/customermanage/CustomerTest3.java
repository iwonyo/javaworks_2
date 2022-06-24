package customermanage;

public class CustomerTest3 {

	public static void main(String[] args) {
		//매개변수가 있는 생성자로 생성하기
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerSon = new VIPCustomer(10020, "손흥민", 100);
		customerSon.bonusPoint = 5000;
		System.out.println(customerSon.showCustomerInfo());
	}

}
