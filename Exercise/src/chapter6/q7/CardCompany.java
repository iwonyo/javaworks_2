package chapter6.q7;

import chapter6.q6.Card;

public class CardCompany {
	private static CardCompany instance;
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {  //외부에서 참조할수 있도록 get() 구현
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
