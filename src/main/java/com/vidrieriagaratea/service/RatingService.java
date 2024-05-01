package com.vidrieriagaratea.service;

import java.util.List;

import com.vidrieriagaratea.exception.ProductException;
import com.vidrieriagaratea.model.Rating;
import com.vidrieriagaratea.model.User;
import com.vidrieriagaratea.request.RatingRequest;

public interface RatingService {
	
	public Rating createRating(RatingRequest req, User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
}
