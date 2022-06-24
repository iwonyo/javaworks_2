package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] data = new double[5];
		double total = 0.0;   //ÃÑÇÕ
		double times = 0.0;   //°öÇÑ°ª
		
		//ÀúÀå
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//¿¬»ê ¹× Á¶È¸
		for(int i=0; i<data.length; i++) {
			total += data[i];
			times *= data[i];
			System.out.println(data[i]);
		}
		System.out.println();
		System.out.println("ÃÑÇÕ : " +  total);
		System.out.println("°ö : " + times);
	}
}
