# Library-Management-system

The system can handle multiple libraries.
Library, Book and Author classes with the below properties.

Library:
  long libraryID(this will uniquely identify a library),
  String libraryName,
  String city

Book:
  long bookID (This will uniquely identify a book)
  String title,
  String type

Author:
  long authorID(This will uniquely identify an author),
  String authorName

LIBRARY, BOOK and AUTHOR tables (uses JDBC) so that these tables can hold LIBRARY, BOOK and AUTHOR
information.
There is a relationship properties/columns in java as well as database tables so that each
library can hold a list of Books and each Book is written by a unique author.

The methods in LibraryManagement.java

1.public boolean addBook(Book book) throws BookAlreadyExistsException
  This method will add the given book as well as it's author details to the system.
  If this book already exists in the system, throw BookAlreadyExistsException.
  If the author already exists, do not add him again, but add the book.
  This method has to return true if the book has been added, otherwise false.

2.public boolean removeBook(long authorID) throws AuthorDoesNotExistsException
  This method removes the given author as well as all his books from the system.
  Throw AuthorDoesNotExistsException, if no such author exists.
  This method has to return true if the operation is success, otherwise false.

3.public ArrayList<Library> getBooks(String city, String name)
  This method will retrieve details of all the libraries belongs to the given city where at least one book
  from the given author is available. Since author names are not unique, this method has to give details
  belongs to all the authors having the given name somewhere in their name.
  
  A main Tester class, created as many number of objects of type Library, Book and Author and test the
  above methods.

# System is not yet fully working.
  Any suggestions will be good
