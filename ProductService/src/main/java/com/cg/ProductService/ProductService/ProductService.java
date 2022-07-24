package com.cg.ProductService.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
	@Autowired
	private ProductRepository productrepository;
	
	public Product saveProduct(Product product) {
		return productrepository.save(product);
	}
	
	public List<Product> saveProduct(List<Product> product) {
		return productrepository.saveAll(product);
	}
	
	public List<Product> getProduct(){
		return productrepository.findAll();
	}
	
	public Product getProductById(int a_id){
		return productrepository.findById(a_id).orElse(null);
	}
	
	public String removeProduct(int a_id) {
		productrepository.deleteById(a_id);
		return "product removed "+a_id;
	}
	
	public Product updateProduct(Product product) {
		Product exitingProduct=productrepository.findById(product.getProductid()).orElse(null);
		exitingProduct.setProductname(product.getProductname());
		exitingProduct.setCategory(product.getCategory());
		exitingProduct.setDescription(product.getDescription());
		exitingProduct.setPrice(product.getPrice());
		return productrepository.save(exitingProduct);
	}
}
	

	







	
