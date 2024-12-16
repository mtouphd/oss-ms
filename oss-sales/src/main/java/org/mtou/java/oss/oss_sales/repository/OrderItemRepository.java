package org.mtou.java.oss.oss_sales.repository;

import org.mtou.java.oss.oss_sales.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

