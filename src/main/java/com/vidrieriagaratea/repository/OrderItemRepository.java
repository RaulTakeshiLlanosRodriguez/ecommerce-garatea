package com.vidrieriagaratea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidrieriagaratea.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
