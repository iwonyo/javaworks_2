
public class CMmanager {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		int price = 10000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calcPrice(price)
		              + "원 지불하셨습니다.");
		
		VIPCustomer customerHong = new VIPCustomer();
		customerHong.setCustomerID(10020);
		customerHong.setCustomerName("홍길동");
		customerHong.bonusPoint = 5000;
		customerHong.setAgentID(55);
		
		System.out.println(customerHong.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + "님이 " + customerHong.calcPrice(price)
		              + "원 지불하셨습니다.");
	}

}
