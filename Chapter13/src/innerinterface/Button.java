package innerinterface;

public class Button {
	OnClickListner listner;
	
	interface OnClickListner{
		void onClick();
	}
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
}
