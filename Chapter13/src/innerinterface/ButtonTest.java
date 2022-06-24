package innerinterface;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		CallListener call = new CallListener();
		button.setOnClickListner(call);
		button.touch();
		
		button.setOnClickListner(new MessageListener());
		button.touch();
		
		button.setOnClickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		button.touch();
	}

}
