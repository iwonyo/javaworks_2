package chapter6.q5;

public class BeanCoffee {
	int money;
	
	public String brewing(int money) {
	
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.BEANRATTE) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�";
		}
		else {
			return null;
		}
	}
}