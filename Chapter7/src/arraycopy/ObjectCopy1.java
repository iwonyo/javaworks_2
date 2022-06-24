package arraycopy;

import array.objectarray.Book;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("아리랑1", "조정래");
		bookArray1[1] = new Book("아리랑2", "조정래");
		bookArray1[2] = new Book("아리랑3", "조정래");
		
		System.arraycopy(bookArray1,0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("미생");
		bookArray1[0].setAuthor("윤태호");
		
		System.out.println("====bookArray1=====");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("====bookArray2=====");
		
		for(Book book : bookArray2) {
			book.showBookInfo();
		}

	}
}
