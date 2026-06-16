package com.educandoweb.projetospring.repository;

import com.educandoweb.projetospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
