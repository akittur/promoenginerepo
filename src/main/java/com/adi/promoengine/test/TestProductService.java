package com.adi.promoengine.test;

import java.util.ArrayList;
import java.util.List;

import com.adi.promoengine.dto.Product;
import com.adi.promoengine.service.ProductService;

public class TestProductService {

	@Mock
	ProductService productService;
	
	@Test
	public void getTotalProceTest()
	{
		List<Product> products = new ArrayList<Product>();
    	Product prodA1 = new Product();
    			prodA1.setId("A");
    	Product prodA2 = new Product();
    			prodA2.setId("A");
    	Product prodA3 = new Product();
    			prodA3.setId("A");
    	Product prodA4 = new Product();
    			prodA4.setId("A");
    	Product prodA5 = new Product();
    			prodA5.setId("A");
    			
    	Product prodB1 = new Product();
    			prodB1.setId("B");
    	Product prodB2 = new Product();
    			prodB2.setId("B");
    	Product prodB3 = new Product();
    			prodB3.setId("B");
    			
    	Product prodC1 = new Product();
    			prodC1.setId("C");
    	Product prodC2 = new Product();
    			prodC2.setId("C");
    			
    	Product prodD1 = new Product();
    			prodD1.setId("D");
    	Product prodD2 = new Product();
    			prodD2.setId("D");
    	
    	products.add(prodA1);
    	products.add(prodA2);
    	products.add(prodA3);
    	products.add(prodA4);
    	products.add(prodA5);
    	products.add(prodB1);
    	products.add(prodB2);
    	products.add(prodB2);
    	products.add(prodB3);
    	products.add(prodC1);
    	products.add(prodC2);
    	products.add(prodD1);
    	products.add(prodD2);
    	
	

		when(productService.GetTotalPrice(products).thenReturn(1200);

	}
	
}
