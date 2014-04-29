package com.mediaiq.bi.server.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mediaiq.bi.server.domain.Book;
import com.mediaiq.bi.server.domain.LendRecords;
import com.mediaiq.bi.server.domain.Person;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bi-server-context.xml")
public class libraryServiceTest {

	@Autowired
	PersonService personService;

	@Autowired
	BookQueryService bookService;

	@Autowired
	LendService lendService;
	
	

	@Test
	public void insertBook() {
		for (int i = 0; i < 10; i++) {
			Book book=new Book("test"+i,"test"+i);
			bookService.save(book);
		}
	}
	@Test
	public void removeBook(){
		Book book=bookService.getById(6L);
		bookService.deleteById(book.getId());
		
		
	}
/*	@Test
	public void fetchBook(){
		Book book=bookService.getById(2L);
		System.out.println(book);
		
	}
	
	
	@Test
	public void updateBook(){
		Book book=bookService.getById(1L);
		book.setAuthor("updatedAuthor");
		
		bookService.save(book);
		
		
	}*/

	@Test
	public void insertPerson() {
		for (int i = 0; i < 10; i++) {
			Person user=new Person("user"+i);
			personService.save(user);
		}
	}
	
/*	@Test
	public void fetchPerson(){
		Person person=personService.getById(1L);
		System.out.println(person);
		assertEquals("user0",person.getName());
	}
	@Test
	public void removePerson(){
		Person person=personService.getById(1L);
		personService.deleteById(person.getId());
		
		
	}
	@Test
	public void updatePerson(){
		Person person=personService.getById(1L);
		person.setName("updatedName");
		
		personService.save(person);
		
		
	}*/
//	@Test
//	public void insertLendRecord(){
//		Person person=personService.getById(3L);
//		Book book=bookService.getById(5L);
//		LendRecords lendRecords=new LendRecords(person,book);
//
//		lendService.save(lendRecords);
//	}
//	@Test
//	public void fetchLendRecord(){
//		Person person=personService.getById(3L);
//		List<LendRecords> lendRecords=(List<LendRecords>) lendService.findByPersonName(person.getName());
//	System.out.println(lendRecords.size());
//       
//		
//	}
	@Test
public void fetchAvailableBooks(){
		System.out.println(lendService.fetchAvailableBook().size());
//	
//       
//		
	}

}
