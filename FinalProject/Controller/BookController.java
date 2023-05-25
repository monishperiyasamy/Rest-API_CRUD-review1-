package com.example.FinalProject.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProject.Service.LibraryService;
import com.example.FinalProject.model.BookInfo;

@RestController
@RequestMapping
public class BookController {
	
	@Autowired
	private LibraryService b_service;
	
	@GetMapping("/")
	public Iterable<BookInfo> getAllBookDetails()
	{
	   return b_service.retrive();
		
	}
	
	@GetMapping("/getbyId/{id}")
	public ResponseEntity<BookInfo> getBookDetailById(@PathVariable("id") int id)
	{
		Optional<BookInfo> book =b_service.retrive1(id);
		if(book.isPresent())
		{
			return new ResponseEntity<>(book.get(),HttpStatus.OK );
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/posting")
	
	public String saveBookDetails(@RequestBody BookInfo book)
	{
		Optional<BookInfo> book_details = b_service.create(book);
		if(book_details.isPresent())
		{
			return "The book data has been added successfully";
		}
		else
		{
			return "Book already exist in records";
		}
	
	}
	@PutMapping("/update/{id}")
	public String updateBookDetails(@RequestBody BookInfo book)
	{
		Optional<BookInfo> book_update = b_service.update(book);
				if(book_update.isEmpty())
				{
					return "The book data does not exit in records";
				}
				else
				{
					return " The book data has been updated successfully";
					
				}
		
	}
	@DeleteMapping("/delete/{id}")
		public String deleteBookById(@PathVariable("id") int id)
		{
			return b_service.delete(id);
		}
		
	
	

}

