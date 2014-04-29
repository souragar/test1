package com.mediaiq.bi.server.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="lend_records",catalog="library")
public class LendRecords {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne(cascade=CascadeType.REMOVE,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="book_id")
	private Book book;
	
	@OneToOne(cascade=CascadeType.REMOVE,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="person_id")
	private Person person;
	
	private String date;

	public LendRecords()
	{
		
	}
		
	public LendRecords(Person p,Book b)
	{
		this.person=p;
		this.book=b;
				
		
	}
		
	
	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "LendRecords [id=" + id + ", book=" + book + ", person="
				+ person + ", date=" + date + "]";
	}
	

}
