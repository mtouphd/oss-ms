package org.mtou.java.oss.oss_sales.repository;

import org.mtou.java.oss.oss_sales.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }
