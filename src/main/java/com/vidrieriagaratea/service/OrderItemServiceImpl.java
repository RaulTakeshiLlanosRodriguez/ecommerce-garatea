package com.vidrieriagaratea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidrieriagaratea.model.OrderItem;
import com.vidrieriagaratea.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService{
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}

}
