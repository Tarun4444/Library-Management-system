--<ScriptOptions statementTerminator=";"/>

CREATE TABLE  LIBRARY(
         library_id      NUMBER(5) 		PRIMARY KEY,
         library_name    VARCHAR2(15)	NOT NULL,
         library_city    VARCHAR2(20) 	NOT NULL,
);

DROP TABLE BOOK

CREATE TABLE  BOOK(
         book_id      NUMBER(5)		PRIMARY KEY,
         book_title   VARCHAR2(15) 	NOT NULL,
         book_type    VARCHAR2(20) 	NOT NULL,
         book_author_id NUMBER(5)   NOT NULL,
         FOREIGN KEY (book_author_id) REFERENCES AUTHOR(author_id)
);



CREATE TABLE  AUTHOR(
         author_id      NUMBER(5) PRIMARY KEY,
         author_name    VARCHAR2(15) NOT NULL
);


select * from AUTHOR,BOOK where AUTHOR.author_id=BOOK.book_id;