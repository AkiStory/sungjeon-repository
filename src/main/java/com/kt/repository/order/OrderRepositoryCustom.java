package com.kt.repository.order;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kt.domain.order.Order;

public interface OrderRepositoryCustom {
	Page<Order> search(String keyword, Pageable pageable);
}
