package com.mediaiq.bi.server.service;

import javax.ws.rs.Path;

import com.mediaiq.bi.server.domain.Person;;

@Path("/person")
public interface PersonService extends
		AbstractCrudService<Person, Long> {

}
