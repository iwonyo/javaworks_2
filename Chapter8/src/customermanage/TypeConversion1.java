package customermanage;

public class TypeConversion1 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "장그래", 2000);  //VIP 고객생성
		vc.bonusPoint = 1000;
		int price = 20000;  //상품 구매
		
		System.out.println(vc.getCustomerName() + "님이 지불해야하는 금액은 "
				 + vc.calcPrice(price) + "원입니다."); 
		System.out.println(vc.getCustomerName()+" 님의 보너스 포인트는 "
				+ vc.bonusPoint + "원입니다.");
	}
}
