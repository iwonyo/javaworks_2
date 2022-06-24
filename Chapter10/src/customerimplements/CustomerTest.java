package customerimplements;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;  //자동 형변환
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
	}
}
