package com.vidrieriagaratea.service;

import java.util.List;

import com.vidrieriagaratea.exception.OrderException;
import com.vidrieriagaratea.model.Address;
import com.vidrieriagaratea.model.Order;
import com.vidrieriagaratea.model.User;

public interface OrderService {
	
	public Order createOrder(User user, Address shippingAddress);
	
	public Order findOrderById(Long orderId) throws OrderException;
	
	public List<Order> usersOrderHistory(Long userId);
	
	public Order placedOrder(Long orderId) throws OrderException;
	
	public Order confirmedOrder(Long orderId) throws OrderException;
	
	public Order shippedOrder(Long orderId) throws OrderException;
	
	public Order deliveredOrder(Long orderId) throws OrderException;
	
	public Order canceledOrder(Long orderId) throws OrderException;
	
	public List<Order> getAllOrders();
	
	public void deleteOrder(Long orderId) throws OrderException;
}
