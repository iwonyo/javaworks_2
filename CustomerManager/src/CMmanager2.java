
public class CMmanager2 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(1001, "이율곡");
		customerLee.bonusPoint = 1000;
		int price= 10000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKing = new VIPCustomer(1002, "세종대왕", 1446);
		customerKing.bonusPoint = 5000;
		System.out.println(customerKing.showCustomerInfo());
		
		System.out.println("=====================할인율과 보너스 포인트 계산 ========================");
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calcPrice(price) + "지불하셨습니다.");
		System.out.println(customerKing.getCustomerName() + "님이 " + customerKing.calcPrice(price) + "지불하셨습니다.");
	}

}
