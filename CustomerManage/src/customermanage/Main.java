package customermanage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10010, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10010, "ȫ�浿");
		Customer customerYoul = new GoldCustomer(10010, "������");
		Customer customerKim = new VIPCustomer(10010, "�̼���",12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("======���� ���� ���========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======�������� ���ʽ� ����Ʈ ���===========");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ� ����Ʈ�� "+ customer.bonusPoint + "���Դϴ�.");
		}

	}

}