package com.example.FinalProject.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProject.Repo.*;
import com.example.FinalProject.model.*;

@Service
public class LibraryService {
	
	@Autowired
	private BookRepository b_repository;
	
	public Iterable<BookInfo> retrive()
	{
		return b_repository.findAll();
	}
	
	public Optional<BookInfo> retrive1(int bookid)
	{
		
		return  b_repository.findById(bookid);
	}
	public Optional<BookInfo >create(BookInfo book)
	{
		if(b_repository.existsById(book.getBookid()))
		{
			return Optional.empty();
			
		}
		else
		{
			return Optional.of(b_repository.save(book));
	}
		
	}
	
	public Optional<BookInfo> update(BookInfo book)
	{
		if(b_repository.existsById(book.getBookid()))
		{
			return Optional.of(b_repository.save(book));
		}
		else
		{
			return Optional.empty();
		}
	}

	public String delete(int id) {
		if(b_repository.existsById(id))
		{
			b_repository.deleteById(id);
			return "The book details of  id "+ id +" deleted successfully";
		}
		else
		{
			return " The employee data does not exit in records";
		}
	}

}
