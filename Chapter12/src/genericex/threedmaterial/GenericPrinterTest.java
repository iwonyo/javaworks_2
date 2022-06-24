package genericex.threedmaterial;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		powder.doPrinting();
		System.out.println(powder);
		
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		powder.doPrinting();
		System.out.println(plastic.toString());

	} 
}
