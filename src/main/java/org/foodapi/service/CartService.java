package org.foodapi.service;

import org.foodapi.dtos.CartRequest;
import org.foodapi.dtos.CartResponse;

public interface CartService {
    CartResponse addToCart(CartRequest request);
    CartResponse getCart();
    void clearCart();
    CartResponse removeFromCart(CartRequest request);
}
