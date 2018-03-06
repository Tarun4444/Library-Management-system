package com;

public class Book {
	private long bookID ;
	private String title;
	private String type;
	private long bookauthorID;
	
	public long getBookID() {
		return bookID;
	}
	public void setBookID(long bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getBookauthorID() {
		return bookauthorID;
	}
	public void setBookauthorID(long bookauthorID) {
		this.bookauthorID = bookauthorID;
	}
	
}
