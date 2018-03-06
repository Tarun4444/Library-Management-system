package com;
import com.Library;
import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		Author auth=new Author();
		book.setBookID(4);
		book.setBookauthorID(3);
		auth.setAuthorID(3);
		auth.setAuthorName("aryan");
		book.setTitle("harryPotter2");
		book.setType("Romantic");
		
		LibraryManagement lib=new LibraryManagement();
		
		//System.out.println(lib.addAuthor(auth));
		
		//System.out.println(lib.addBook(book));
		
		System.out.println(lib.removeBook(1));
		
		String city="";
		String name="";
		ArrayList<Library> l;
		//l=lib.getBooks(city,name);
		
	}
}
