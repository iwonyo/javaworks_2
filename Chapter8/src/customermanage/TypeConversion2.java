package customermanage;

public class TypeConversion2 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerSon = new VIPCustomer(10030, "손흥민", 12346);
		customerSon.bonusPoint = 5000;
		System.out.println(customerSon.showCustomerInfo());
		
		int price = 10000;  //상품 구매
		
		System.out.println("===========할인율과 보너스 포인트 계산 ===========");
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calcPrice(price)
        +"원 지불하였고, 보너스 포인트는 " + customerLee.bonusPoint + "입니다.");
		
		System.out.println(customerSon.getCustomerName() + "님이 " + customerSon.calcPrice(price)
        +"원 지불하였고, 보너스 포인트는 " + customerSon.bonusPoint + "입니다.");
	}
}
