package com.mediaiq.bi.server.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediaiq.bi.server.service.AbstractCrudService;

public abstract class AbstractCrudServiceImpl<T, ID extends Serializable, R extends JpaRepository<T, ID>>
		implements AbstractCrudService<T, ID> {

	@Override
	public List<T> get() {
		return getRepository().findAll();
	}

	@Override
	public T save(T t) {
		return getRepository().save(t);
	}

	@Override
	public void deleteAll() {
		getRepository().deleteAll();
	}

	@Override
	public T getById(ID id) {
		return getRepository().findOne(id);
	}

	@Override
	public void deleteById(ID id) {
		getRepository().delete(id);
	}

	public abstract R getRepository();
}