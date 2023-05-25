package com.example.FinalProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="bookdetails")
public class BookInfo {
	@Id

	private int bookid;
	private String bookname;
	private String bookauthor;
	private String bookgenre;
	
	private String bookprice;
	private String bookrating;
	private String publishedyear;
	private String bookavailability;
	private String bookpublication;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookgenre() {
		return bookgenre;
	}
	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}

	public String getBookprice() {
		return bookprice;
	}
	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}
	public String getBookrating() {
		return bookrating;
	}
	public void setBookrating(String bookrating) {
		this.bookrating = bookrating;
	}
	public String getPublishedyear() {
		return publishedyear;
	}
	public void setPublishedyear(String publishedyear) {
		this.publishedyear = publishedyear;
	}
	public String getBookavailability() {
		return bookavailability;
	}
	public void setBookavailability(String bookavailability) {
		this.bookavailability = bookavailability;
	}
	public String getBookpublication() {
		return bookpublication;
	}
	public BookInfo(int bookid, String bookname, String bookauthor, String bookgenre,
			String bookprice, String bookrating, String publishedyear, String bookavailability, String bookpublication) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookgenre = bookgenre;
		
		this.bookprice = bookprice;
		this.bookrating = bookrating;
		this.publishedyear = publishedyear;
		this.bookavailability = bookavailability;
		this.bookpublication = bookpublication;
	}
	public void setBookpublication(String bookpublication) {
		this.bookpublication = bookpublication;
		
	}
	public BookInfo()
	{
		
	}
	
	
	
}
