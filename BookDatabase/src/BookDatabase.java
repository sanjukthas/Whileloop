//import java.awt.print.Book;
//import BookApplication.Book;

import java.util.Scanner;

public class BookDatabase {
	private String title;
	private String author;
	private String description;
	
	BookApplication[] mybooks = new BookApplication[100];
	int bookCounter = 0;
	
	public void createBookList(){
		
		String proceed = "Y";
		while (proceed.toUpperCase().equals("Y")){
			 System.out.println("Author: ");
			 String n = new Scanner(System.in).next();
			 System.out.println("Title: ");
			 String x = new Scanner(System.in).next();
		     System.out.println("Description: ");
		     String y = new Scanner(System.in).next();

		     BookApplication newbook= new BookApplication("Author","Title","Description");
	
		     mybooks [bookCounter]=newbook;
	
		     bookCounter++;
			
			System.out.println("Do you want to continue?:Y ? N ");
			 proceed = new Scanner(System.in).next();
		}
	}
	
	public int getBooksCount() {
		return bookCounter;
	}
	public BookApplication[] returnBookList(){ 
		return this.mybooks;
	}
	
	public BookApplication searchBook(String title) 
	{
		
		for (int i=0; i<getBooksCount(); i++) {
			if (mybooks[i].gettitle().equals(title)) {
				return mybooks[i];
			}
		}
		return null;
	}
	
}
