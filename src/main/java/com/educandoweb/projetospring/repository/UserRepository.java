package com.educandoweb.projetospring.repository;

import com.educandoweb.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
