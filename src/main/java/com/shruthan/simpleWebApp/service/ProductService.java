package com.shruthan.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shruthan.simpleWebApp.model.Product;

@Component
public class ProductService {

	private final Product product;
	List<Product> products = new ArrayList<Product>(Arrays.asList(new Product(101, "IPhone", 50000),
			new Product(102, "Samsung", 100000), new Product(103, "Mic", 90000)));

	ProductService(Product product) {
		this.product = product;
	}

	public List<Product> getAllProducts() {
		return products;
	}

	public Product getProductById(int prodId) {

		return products.stream().filter(p -> p.getProductId() == prodId).findFirst()
				.orElse(new Product(100, "No item found", 0));
	}

	public void addProduct(Product prod) {
		products.add(prod);
	}

	public void updateProduct(Product prod) {
		
		int index = 0;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductId() == prod.getProductId()) {
				index = i;
			}
		}
		products.set(index, prod);
	}

	public void deleteProduct(Product prod) {
		
	    for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductId() == prod.getProductId()) {
				products.remove(i);
			}
		}
	}
}
