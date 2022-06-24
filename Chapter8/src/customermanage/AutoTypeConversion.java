package customermanage;

public class AutoTypeConversion {
	public static void main(String[] args) {
//		Customer vc = new VIPCustomer(10020, "장그래", 2000);
//		vc.bonusPoint = 1000;
//		System.out.println(vc.showCustomerInfo());
//		System.out.println(vc.getCustomerName()+"님이 지불해야하는 금액은 "+vc.calcPrice(10000)+"원입니다.");
//		
//		Customer gc = new GoldCustomer(10030,"황의조");
//		gc.bonusPoint = 2000;
//		System.out.println(gc.showCustomerInfo());
//		System.out.println(gc.getCustomerName()+"님이 지불해야하는 금액은 "+gc.calcPrice(20000) + "원입니다.");
		
		Customer vc = new VIPCustomer(10000, "추신수", 77);
		vc.bonusPoint = 1000;
		System.out.println(vc.showCustomerInfo());
		
		int price = 10000;
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPrice(price) + "원 입니다.");
		System.out.println(vc.getCustomerName() + "님의 보너스 포인트는 " + vc.bonusPoint + "원 입니다.");
	}
}
