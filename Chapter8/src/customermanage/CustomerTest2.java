package customermanage;

public class CustomerTest2 {

	public static void main(String[] args) {
		VIPCustomer Kim = new VIPCustomer();
		Kim.setCustomerID(10020);
		Kim.setCustomerName("±Ë¿ØΩ≈");
		Kim.bonusPoint = 1000;
		Kim.agentID = 78;
		
		System.out.println(Kim.showCustomerInfo());
	}

}
