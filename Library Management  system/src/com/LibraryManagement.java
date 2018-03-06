package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibraryManagement {
	public Connection con=null;
	public PreparedStatement ps=null;
	
	public boolean addAuthor(Author auth){
		try{
			con=DataBaseUtil.getConnection();
		    Statement st = con.createStatement();
		    ResultSet rs=st.executeQuery("select * from BOOk");
		    while(rs.next()){
		    	if(rs.getLong(4)==auth.getAuthorID()){
		    		throw new BookAlreadyExistsException("AuthorAlreadyExists");
		    	}
		    }
		    st.execute("insert into AUTHOR VALUES(" + auth.getAuthorID() + "  , '"+auth.getAuthorName()+"')");	
		}catch(BookAlreadyExistsException ex){
			System.out.println(ex.getMessage());
			return false;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DataBaseUtil.closeConnection();			
		}
		return true;	
	}
	
	public boolean addBook(Book book){
		try{
			
			con=DataBaseUtil.getConnection();
		    Statement st = con.createStatement();
		    ResultSet rs=st.executeQuery("select * from AUTHOR,BOOK where AUTHOR.author_id=BOOK.book_id");
		    
		    while(rs.next()){
		    	if(rs.getLong(3)==book.getBookID()){
		    		throw new BookAlreadyExistsException("BookAlreadyExists");
		    	}
		    	
		    }
		    st.execute("insert into BOOK VALUES("+book.getBookID()+",'"+book.getTitle()+"','" + book.getType()+"','" + book.getBookauthorID()+"')");	
		}catch(BookAlreadyExistsException ex){
			System.out.println(ex.getMessage());
			return false;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			DataBaseUtil.closeConnection();			
		}
		return true;	
	}
	
	public boolean removeBook(long authorID){		
		String deleteSQL = "DELETE FROM AUTHOR WHERE author_id = ?";
		String delSQL = "DELETE FROM BOOK WHERE book_author_id = ?";
		try {
			con=DataBaseUtil.getConnection();
			PreparedStatement preparedStatement = null;
			
			preparedStatement=con.prepareStatement(delSQL);
			preparedStatement.setLong(1,authorID );
			int s=preparedStatement.executeUpdate();
			
			if(s>0)System.out.println("books deleted!");
			else System.out.println("No book with given id");
			
			preparedStatement = con.prepareStatement(deleteSQL);
			preparedStatement.setLong(1,authorID );
			
			int status=preparedStatement.executeUpdate();
			
			if(status>0)System.out.println("Record is deleted!");
			else
				throw new AuthorDoesNotExistsException("Author Does Not Exists");
		}catch(AuthorDoesNotExistsException ex){
				System.out.println(ex.getMessage());
				return false;
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DataBaseUtil.closeConnection();
		}
		return true;
	}
	
	
	public ArrayList<Library> getBooks(String city, String name){
		ArrayList<Library> bookList=new ArrayList<>();		
		con=DataBaseUtil.getConnection();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from LIBRARY where ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
