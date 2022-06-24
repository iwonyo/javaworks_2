package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

//	@Override
//	public String toString() {
//		return author + ", " + title;
//	}
	
}


public class ToStringEx {
	public static void main(String[] args) {
		String name = "Sara";
		System.out.println(name);
		
		String name2 = new String("Obama");
		System.out.println(name2);
		
		Book book = new Book("Do it Java", "¹ÚÀºÁ¾");
		System.out.println(book);
		System.out.println(book.toString());
	}
}
