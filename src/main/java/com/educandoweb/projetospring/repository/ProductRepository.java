package com.educandoweb.projetospring.repository;

import com.educandoweb.projetospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
