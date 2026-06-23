package com.educandoweb.projetospring.repository;

import com.educandoweb.projetospring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
