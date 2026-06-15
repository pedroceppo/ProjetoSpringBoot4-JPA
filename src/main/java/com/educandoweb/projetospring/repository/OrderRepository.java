package com.educandoweb.projetospring.repository;

import com.educandoweb.projetospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
