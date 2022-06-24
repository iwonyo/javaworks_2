package array.objectarray;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		int i;
		
//		for(i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("아리랑1", "조정래");
		library[1] = new Book("아리랑2", "조정래");
		library[2] = new Book("아리랑3", "조정래");
		library[3] = new Book("아리랑4", "조정래");
		library[4] = new Book("아리랑5", "조정래");
		
		for(i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
//		library[0] = new Book("미생1", "윤태호");  //수정 저장
//	
//		for(Book book : library) {  //향상된 for
//			book.showBookInfo();
//		}
//		
//		for(i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}

	}

}
