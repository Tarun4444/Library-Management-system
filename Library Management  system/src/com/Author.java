package com;

public class Author {
	private long authorID ; //(This will uniquely identify an author),
	private String authorName;
	
	public long getAuthorID() {
		return authorID;
	}
	public void setAuthorID(long authorID) {
		this.authorID = authorID;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
