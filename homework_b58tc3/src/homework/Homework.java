package homework;

public class Homework {

	public static void main(String[] args) {

		book book = new book();
		book.setAuthor("Agatha Christi");
		book.setTitle("Murder On the Orient Express");

		book.setPrice(2500);
		book.setYearOfPub(1950);
		
		System.out.println(book.dispInfo());
		
		book.incPrice(15);
		System.out.println(book.dispInfo());
	}

}
