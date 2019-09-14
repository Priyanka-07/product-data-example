package com.adidas.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adidas.api.DataModel.AdidasProduct;
import com.adidas.api.service.AdidasProductService;

@RestController
@RequestMapping("/adidas")
public class AdidasProductAPIController {
     
	@Autowired
	private AdidasProductService adidasProductService;
	
	@PostMapping("/")
    public void saveProductData(@RequestBody AdidasProduct adidasProduct) {
		try {
			AdidasProduct product=adidasProductService.saveorUpdateProductData(adidasProduct);
			adidasProductService.sendMessage(product.getId());
		} catch (Exception e) {
			System.out.println("Exception occured while saving product with Id "+adidasProduct.getId());
			System.err.println(e.getMessage());
		}
		
    }
	
	@GetMapping("/{id}")
	public Optional<AdidasProduct> getProductDataByIds(@PathVariable String id){
		try {
			return adidasProductService.getProductDatabyId(id);
		} catch (Exception e) {
			System.out.println("Exception occured while getting product with Id "+id);
			System.err.println(e.getMessage());
		}
		return null;
		
		
	}
	
	@GetMapping("/")
	public List<AdidasProduct> getProductDataList(){
		try {
			return adidasProductService.getAllProducts();
		} catch (Exception e) {
			System.out.println("Exception occured while getting product list");
			System.err.println(e.getMessage());
		}
		return null;
	
		
	}
}
