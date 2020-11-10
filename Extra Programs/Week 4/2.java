import java.util.Scanner;

class Book {
	int bookid;
	String bookTitle;
	int no_pages;
	int year_of_pub;
	String author;
	String publisher;
	int price;

	void getData() {
		Scanner inp = new Scanner(System.in);

		System.out.print("Bood ID : ");
		bookid = inp.nextInt();
		inp.nextLine();
		System.out.print("Title of book : ");
		bookTitle = inp.nextLine();
		System.out.print("No. of pages : ");
		no_pages = inp.nextInt();
		System.out.print("Year of publishing : ");
		year_of_pub = inp.nextInt();
		inp.nextLine();
		System.out.print("Author : ");
		author = inp.nextLine();
		System.out.print("Publisher : ");
		publisher = inp.nextLine();
		System.out.print("Price of the book : ");
		price = inp.nextInt();
	}

	void printData() {
		System.out.println("Bood ID : "+bookid);
		System.out.println("Title of book : "+bookTitle);
		System.out.println("No. of pages : "+no_pages);
		System.out.println("Year of publishing : "+year_of_pub);
		System.out.println("Author : "+author);
		System.out.println("Publisher : "+publisher);
		System.out.println("Price of the book : "+price);
	}
}

class bookWeek4 {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		b1.getData();
		b2.getData();
		b3.getData();

		if(b1.price>b2.price && b1.price>b3.price) {
			System.out.println("Most expensive book : "+b1.bookTitle);
		}
		else if(b2.price>b1.price && b2.price>b3.price) {
			System.out.println("Most expensive book : "+b2.bookTitle);
		}
		else {
			System.out.println("Most expensive book : "+b3.bookTitle);
		}

		int cnt = 0;
		if(b1.year_of_pub == 2020) {
			cnt++;
		}

		if(b2.year_of_pub == 2020) {
			cnt++;
		}

		if(b3.year_of_pub == 2020) {
			cnt++;
		}
		System.out.println("No of books published in 2020 = " +cnt);

		System.out.println("Details of book with least pages : ");
		if(b1.no_pages<b2.no_pages && b1.no_pages<b3.no_pages){
			b1.printData();
		}
		else if(b2.no_pages<b1.no_pages && b2.no_pages<b3.no_pages){
			b2.printData();
		}
		else {
			b3.printData();
		}
	}
}
