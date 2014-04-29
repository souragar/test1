package com.mediaiq.bi.server.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaiq.bi.server.domain.Person;
import com.mediaiq.bi.server.repo.PersonRepo;
import com.mediaiq.bi.server.service.PersonService;


@Service
public class PersonServiceImpl extends
		AbstractCrudServiceImpl<Person, Long, PersonRepo> implements
		PersonService {

	@Autowired
	private PersonRepo personRepo;

	@Override
	public PersonRepo getRepository() {
		return personRepo;
	}
}

