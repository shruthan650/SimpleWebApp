package com.shruthan.simpleWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shruthan.simpleWebApp.model.Product;
import com.shruthan.simpleWebApp.repository.ProductRepo;

@Component
public class ProductService {
	
	@Autowired
	ProductRepo repo;

//	private final Product product;
//	List<Product> products = new ArrayList<Product>(Arrays.asList(new Product(101, "IPhone", 50000),
//			new Product(102, "Samsung", 100000), new Product(103, "Mic", 90000)));

	ProductService() {
//		this.product = product;
	}

	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	public Product getProductById(Integer prodId) {

		return  repo.findById(prodId).orElse(new Product());
	}

	public void addProduct(Product prod) {
		repo.save(prod);
	}

	public void updateProduct(Product prod) {
		
		repo.save(prod);
	}

	public void deleteProduct(Integer prodId) {
		
	    repo.deleteById(prodId);
	}
}
