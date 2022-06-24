package customermanage;

public class CustomerTest1 {

	public static void main(String[] args) {
		//기본생성자로 생성하기
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerSon = new VIPCustomer();
		customerSon.setCustomerID(10020);
		customerSon.setCustomerName("손흥민");
		customerSon.bonusPoint = 5000;
		customerSon.agentID = 77;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerSon.showCustomerInfo());
	}

}
