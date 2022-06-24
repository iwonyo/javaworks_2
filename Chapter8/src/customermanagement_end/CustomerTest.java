package customermanagement_end;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("김기용");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKang = new VIPCustomer(10020, "손흥민", 12345);
		customerKang.bonusPoint = 1000;
		System.out.println(customerKang.showCustomerInfo());
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kangPrice = customerKang.calcPrice(price);
		System.out.println(customerLee.getCustomerName() + "���� " +  leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKang.getCustomerName() + "���� " +  kangPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerKang.showCustomerInfo());
	}

}
