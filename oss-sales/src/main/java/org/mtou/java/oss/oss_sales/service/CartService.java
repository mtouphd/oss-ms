package org.mtou.java.oss.oss_sales.service;

import lombok.RequiredArgsConstructor;
import org.mtou.java.oss.oss_sales.model.Cart;
import org.mtou.java.oss.oss_sales.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CartService {


    private final CartRepository cartRepository;

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(Long id, Cart cart) {
        Cart existingCart = cartRepository.findById(id).orElse(null);
        if (existingCart != null) {
            existingCart.setCustomer(cart.getCustomer());
            existingCart.setCartItems(cart.getCartItems());
            existingCart.setCreatedAt(cart.getCreatedAt());
            existingCart.setUpdatedAt(cart.getUpdatedAt());
            return cartRepository.save(existingCart);
        }
        return null;
    }

    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }
}

