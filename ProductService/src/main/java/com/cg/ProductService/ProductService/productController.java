package com.cg.ProductService.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")
public class productController {

	@Autowired
	private ProductService productservice;	 
	
	@GetMapping("/{ProductId}")
    public String getproductinfo(@PathVariable("ProductId") int ProductId){
       return "hello world...!!! This is admin service";
      
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
    	return productservice.saveProduct(product);
    }
    
    
    @PostMapping("/addProduct")
    public List<Product> addProduct(@RequestBody List<Product> product) {
    	return productservice.saveProduct(product);
    }
    
    
    @GetMapping("/getproduct")
    public List<Product> findAllProducts(){
    	return productservice.getProduct();
    }
    
    
    @GetMapping("/getProduct/{P_id}")
    public Product findProductById(@PathVariable int P_id){
    	return productservice.getProductById(P_id);
    }
    
    
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
    	return productservice.updateProduct(product);
    }
    
    @DeleteMapping("/deleteProduct/{P_id}")
    public String deleteProductById(@PathVariable int P_id){
    	return productservice.removeProduct(P_id);
    }
}
