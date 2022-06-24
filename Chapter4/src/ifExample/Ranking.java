package ifExample;

public class Ranking {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default: medalColor = 'A';
		}
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");
		
		//if문으로 호환
		if(rank == 1) {
			medalColor = 'G';
		}
		else if(rank == 2) {
			medalColor = 'S';
		}
		else if(rank == 3) {
			medalColor = 'B';
		}
		else {
			medalColor = 'A';
		}
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");
	}

}
