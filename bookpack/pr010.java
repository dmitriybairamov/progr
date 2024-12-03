
package bookpack;
class Book {
	private String title;
	private String author;
	private int pubDate;
	
	Book(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}

}

class pr010 {
	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		books[0] = new Book("Illiada", "Gomer", 1980);
		books[1] = new Book("Ynesennie vetrom", "Mitchell", 2000);
		books[2] = new Book("Naedine s soboy", "Mark Avreliy", 1950);
		books[3] = new Book("Sobor Parijskoi Bogomateri", "Gugo", 1980);
		books[4] = new Book("Prestyplenie i nakazanie", "Dostaevsky", 1950);
		for (int i = 0; i < books.length; i++)
			books[i].show();

	}
}	
