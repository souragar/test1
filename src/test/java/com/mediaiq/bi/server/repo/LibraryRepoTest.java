package com.mediaiq.bi.server.repo;

import static org.junit.Assert.*;

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
import com.mediaiq.bi.server.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bi-server-context.xml")
public class LibraryRepoTest {

	@Autowired
	PersonRepo personRepo;

	@Autowired
	BookRepo bookRepo;

	@Autowired
	LendRepo lendRepo;
	
	

	@Test
	public void insertBook() {
		/*for (int i = 0; i < 10; i++) {
			Book book=new Book("test"+i,"test"+i);
			bookRepo.save(book);
		}*/
	}
//	@Test
//	public void fetchBook(){
//		Book book=bookRepo.findOne(1L);
//		System.out.println(book);
//		
//	}
//	
//	@Test
//	public void removeBook(){
//		Book book=bookRepo.findOne(2L);
//		bookRepo.delete(book);
//		
//		
//	}
//	@Test
//	public void updateBook(){
//		Book book=bookRepo.findOne(1L);
//		book.setAuthor("updatedAuthor");
//		
//		bookRepo.save(book);
//		
//		
//	}
//	
//	@Test
//	public void insertPerson() {
//		for (int i = 0; i < 10; i++) {
//			Person user=new Person("user"+i);
//			personRepo.save(user);
//		}
//	}
//	
//	@Test
//	public void fetchPerson(){
//		Person person=personRepo.findOne(1L);
//		System.out.println(person);
//		assertEquals("user0",person.getName());
//	}
//	@Test
//	public void removePerson(){
//		Person person=personRepo.findOne(2L);
//		personRepo.delete(person);
//		
//		
//	}
//	@Test
//	public void updatePerson(){
//		Person person=personRepo.findOne(1L);
//		person.setName("updatedName");
//		
//		personRepo.save(person);
//		
//		
//	}
//	@Test
//	public void insertLendRecord(){
//		Person person=personRepo.findOne(1L);
//		Book book=bookRepo.findOne(1L);
//		LendRecords lendRecords=new LendRecords(person,book);
//
//		lendRepo.save(lendRecords);
//	}
//	@Test
//	public void fetchLendRecord(){
//		Person person=personRepo.findOne(31L);
//		Book book=bookRepo.findOne(1L);
//		List<LendRecords> lendRecords=new ArrayList();
//		lendRecords=(List<LendRecords>) lendRepo.findByPersonName(person.getName());
//       
//		
//	}
//	@Test
//	public void fetchAvailableBooks(){
//		System.out.println(bookRepo.fetchAvailableBook().size());
//	
//       
//		
//	}

}
