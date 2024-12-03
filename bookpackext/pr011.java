package booxpackext;
class pr011 {
	public static void main(String[] args) {
		bookpack.Book[] books = new bookpack.Book[5];
		books[0] = new bookpack.Book("Illiada", "Gomer", 1980);
		books[1] = new bookpack.Book("Ynesennie vetrom", "Mitchell", 2000);
		books[2] = new bookpack.Book("Naedine s soboy", "Mark Avreliy", 1950);
		books[3] = new bookpack.Book("Sobor Parijskoi bogomateri", "Gugo", 1970);
		books[4] = new bookpack.Book("Prestyplenie i nakazanie", "Dostaevsky", 1950);
		for(int i=0; i < books.length; i++)
			books[i].show();
	}
}
