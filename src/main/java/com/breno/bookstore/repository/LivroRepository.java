package com.breno.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.breno.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
