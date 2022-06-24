package staticexample;

public class BCoffeeMain {

		public static void main(String[] args) {
			BCoffee coffee = new BCoffee();
			coffee.name = "빽다방";
			
			System.out.println(coffee.name + "의 아메리카노는 " + BCoffee.AMERICANO + "원 입니다.");
			System.out.println(coffee.name + "의 라떼는 " + BCoffee.RATTE+ "원 입니다.");
			
		}
}
