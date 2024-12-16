package org.mtou.java.oss.oss_sales.repository;

import org.mtou.java.oss.oss_sales.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> { }