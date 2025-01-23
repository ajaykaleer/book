package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simple.book.Service.ServiceImp;

import entity.Book;

@RestController
@RequestMapping("/Book")
public class BController {

	@Autowired
	//ServiceImp ss=new ServiceImp();
	private ServiceImp imp;
	
	@GetMapping
	public List<Book> getAll(@RequestParam Book book)
	{
		return imp.getAllBooks();
		
		
	}
	
	
	
}