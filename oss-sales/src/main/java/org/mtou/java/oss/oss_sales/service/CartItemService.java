package org.mtou.java.oss.oss_sales.service;

import lombok.RequiredArgsConstructor;
import org.mtou.java.oss.oss_sales.model.CartItem;
import org.mtou.java.oss.oss_sales.repository.CartItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CartItemService {

    private final CartItemRepository cartItemRepository;

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public CartItem getCartItemById(Long id) {
        return cartItemRepository.findById(id).orElse(null);
    }

    public CartItem createCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public CartItem updateCartItem(Long id, CartItem cartItem) {
        CartItem existingCartItem = cartItemRepository.findById(id).orElse(null);
        if (existingCartItem != null) {
            existingCartItem.setCart(cartItem.getCart());
            existingCartItem.setProductId(cartItem.getProductId());
            existingCartItem.setQuantity(cartItem.getQuantity());
            return cartItemRepository.save(existingCartItem);
        }
        return null;
    }

    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }
}
