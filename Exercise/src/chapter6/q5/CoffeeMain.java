package chapter6.q5;

public class CoffeeMain {

	public static void main(String[] args) {
		Person kim = new Person("Kim", 10000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, 3000);
		kim.buyBeanCoffee(beanCoffee, 4500);
	}

}
