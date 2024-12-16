package org.mtou.java.oss.oss_sales.service;

import lombok.RequiredArgsConstructor;
import org.mtou.java.oss.oss_sales.model.OrderItem;
import org.mtou.java.oss.oss_sales.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public OrderItem getOrderItemById(Long id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public OrderItem updateOrderItem(Long id, OrderItem orderItem) {
        OrderItem existingOrderItem = orderItemRepository.findById(id).orElse(null);
        if (existingOrderItem != null) {
            existingOrderItem.setOrder(orderItem.getOrder());
            existingOrderItem.setQuantity(orderItem.getQuantity());
            existingOrderItem.setPrice(orderItem.getPrice());
            existingOrderItem.setProductId(orderItem.getProductId());
            return orderItemRepository.save(existingOrderItem);
        }
        return null;
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}

