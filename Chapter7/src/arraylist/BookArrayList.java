package arraylist;

import java.util.ArrayList;

import array.objectarray.Book;
public class BookArrayList {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		Book book1 = new Book("아리랑1", "조정래");
		library.add(book1);
		/*
		library.add(new Book("아리랑1", "조정래"));
		library.add(new Book("아리랑2", "조정래"));
		library.add(new Book("아리랑3", "조정래"));
		library.add(new Book("아리랑4", "조정래"));
		library.add(new Book("아리랑5", "조정래"));*/
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println("===향상된 for문 사용===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
