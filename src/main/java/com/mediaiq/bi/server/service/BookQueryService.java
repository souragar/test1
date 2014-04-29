package com.mediaiq.bi.server.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mediaiq.bi.server.domain.Book;;

@Path("/books")
public interface BookQueryService extends
		AbstractCrudService<Book, Long> {

	@GET
	@Path("/bookname/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	List<Book> getByName(@PathParam("name") String name);
	@GET
	@Path("/author/{author}")
	@Produces(MediaType.APPLICATION_JSON)
	List<Book> getByAuthor(@PathParam("author") String author);
	
}
