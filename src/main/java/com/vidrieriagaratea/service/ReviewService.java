package com.vidrieriagaratea.service;

import java.util.List;

import com.vidrieriagaratea.exception.ProductException;
import com.vidrieriagaratea.model.Review;
import com.vidrieriagaratea.model.User;
import com.vidrieriagaratea.request.ReviewRequest;

public interface ReviewService {
	
	public Review createReview(ReviewRequest req, User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
}
