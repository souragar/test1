package com.mediaiq.bi.server.service;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface AbstractCrudService<T, ID extends Serializable> {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	List<T> get();

	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	T save(T t);

	@DELETE
	@Path("/")
	void deleteAll();

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	T getById(@PathParam("id") ID id);
	
	
	@DELETE
	@Path("/{id}")
	void deleteById(@PathParam("id") ID id);

}