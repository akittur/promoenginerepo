package com.adi.promoengine.service;

import java.util.List;

import com.adi.promoengine.dto.Product;

public interface ProductService {

	void GetPriceByType(Product product);
    int GetTotalPrice(List<Product> products);
}
