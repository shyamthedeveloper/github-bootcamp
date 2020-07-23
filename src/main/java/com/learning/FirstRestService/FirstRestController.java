package com.learning.FirstRestService;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
	
	@GetMapping("/books")
	public List<Book> getsAllBooks(){
		
		return Arrays.asList(new Book(12,"game of thrown 1.1", "abc author"));
	}

}
