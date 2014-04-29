package com.mediaiq.bi.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mediaiq.bi.server.domain.Person;;

public interface PersonRepo extends JpaRepository<Person, Long> {

}