package com.carlosrenan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlosrenan.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}