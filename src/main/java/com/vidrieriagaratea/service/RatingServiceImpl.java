package com.vidrieriagaratea.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vidrieriagaratea.exception.ProductException;
import com.vidrieriagaratea.model.Product;
import com.vidrieriagaratea.model.Rating;
import com.vidrieriagaratea.model.User;
import com.vidrieriagaratea.repository.RatingRepository;
import com.vidrieriagaratea.request.RatingRequest;

@Service
public class RatingServiceImpl implements RatingService{
	
	private RatingRepository ratingRepository;
	private ProductService productService;
	
	public RatingServiceImpl(RatingRepository ratingRepository,ProductService productService) {
		this.ratingRepository = ratingRepository;
		this.productService = productService;
	}
	
	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		Product product = productService.findProductById(req.getProductId());
		
		Rating rating = new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		return ratingRepository.getAllProductsRating(productId);
	}

}
