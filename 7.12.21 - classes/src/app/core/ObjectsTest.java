package app.core;

public class ObjectsTest {

	public static void main(String[] args) {
		
		Book b = new Book ("84-94-79-0", "hello", "Avi Choen", 99);
		Rectangle r = new Rectangle (55,10);
		
		System.out.println("Area: " + r.getArea());
		System.out.println("Parimeter: " + r.getParimeter());
		System.out.println("Author: " + b.getAuthor());
		System.out.println("Isbn: " + b.getIsbn());
		System.out.println("Title: " + b.getTitle());
		System.out.println("Price: " + b.getPrice());

	}

}
