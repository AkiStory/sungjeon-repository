package com.kt.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kt.domain.product.Product;
import com.kt.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;

	public void create(String name, Long price, Long quantity) {
		productRepository.save(new Product(
				name,
				price,
				quantity
			)
		);
	}

	public void update(Long id) {
		var product = productRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("존재 하지 않는 상품입니다."));
		product.inActivate();
	}

	public void activate(Long id) {
		var product = productRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("존재 하지 않는 상품입니다."));
		product.Activate();
	}

	public void delete(Long id) {
		var product = productRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("존재 하지 않는 상품입니다."));
		product.delete();
	}
}
