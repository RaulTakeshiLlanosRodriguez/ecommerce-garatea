package com.vidrieriagaratea.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vidrieriagaratea.exception.ProductException;
import com.vidrieriagaratea.model.Product;
import com.vidrieriagaratea.model.Review;
import com.vidrieriagaratea.model.User;
import com.vidrieriagaratea.repository.ReviewRepository;
import com.vidrieriagaratea.request.ReviewRequest;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	private ReviewRepository reviewRepository;
	private ProductService productService;
	
	public ReviewServiceImpl(ReviewRepository reviewRepository,ProductService productService) {
		this.reviewRepository = reviewRepository;
		this.productService = productService;
	}
	
	@Override
	public Review createReview(ReviewRequest req, User user) throws ProductException {
		Product product = productService.findProductById(req.getProductId());
		
		Review review = new Review();
		review.setUser(user);
		review.setProduct(product);
		review.setReview(req.getReview());
		review.setCreatedAt(LocalDateTime.now());

		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReview(Long productId) {
		
		return reviewRepository.getAllProductsReview(productId);
	}

}
