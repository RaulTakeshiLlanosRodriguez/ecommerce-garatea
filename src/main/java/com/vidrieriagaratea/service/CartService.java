package com.vidrieriagaratea.service;

import com.vidrieriagaratea.exception.ProductException;
import com.vidrieriagaratea.model.Cart;
import com.vidrieriagaratea.model.User;
import com.vidrieriagaratea.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);
	
}
