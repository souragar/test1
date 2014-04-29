package com.mediaiq.bi.server.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




import org.springframework.data.jpa.repository.Query;

import com.mediaiq.bi.server.domain.Book;;

public interface BookRepo extends JpaRepository<Book, Long> {
	public List<Book> findByName(String name);
	public List<Book> findByAuthor(String author);
	@Query("Select book from Book book where book not in (select l.book from LendRecords l)")
	public List<Book> fetchAvailableBook();
}