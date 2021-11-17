package com.breno.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.breno.bookstore.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
