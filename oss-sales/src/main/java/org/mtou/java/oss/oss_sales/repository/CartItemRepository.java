package org.mtou.java.oss.oss_sales.repository;

import org.mtou.java.oss.oss_sales.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {}
