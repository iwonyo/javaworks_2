package chapter6.q7;

import chapter6.q6.Card;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		System.out.println(card1.getCardNumber());
		
		Card card2 = company.createCard();
		System.out.println(card2.getCardNumber());
		
		Card card3 = company.createCard();
		System.out.println(card3.getCardNumber());
	}
}
