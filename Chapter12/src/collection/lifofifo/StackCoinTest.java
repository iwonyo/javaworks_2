package collection.lifofifo;

import java.util.Stack;
public class StackCoinTest {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin500 = new Coin(500);
		Coin coin10 = new Coin(10);
		
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin500);
		coinBox.push(coin10);

		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}

}
