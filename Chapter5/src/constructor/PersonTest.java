package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personSon = new Person();
		personSon.name = "¼ÕÈï¹Î";
		personSon.height = 183.2F;
		personSon.weight = 76.7F;
		
		Person personPark = new Person("¹ÚÀÎºñ");
		personPark.height = 168;
		personPark.weight = 50.3F;
		
		Person personHwang = new Person("Ãß½Å¼ö", 180.3F, 95);
		
		personSon.showInfo();
		personPark.showInfo();
		personHwang.showInfo();
	}
}
