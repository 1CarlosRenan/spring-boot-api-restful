package com.carlosrenan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosrenan.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}