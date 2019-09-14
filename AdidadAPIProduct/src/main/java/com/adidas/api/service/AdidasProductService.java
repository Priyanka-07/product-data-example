package com.adidas.api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.adidas.api.DataModel.AdidasProduct;
import com.adidas.api.dao.AdidasProductRepository;

@Service
public class AdidasProductService {
	
    @Autowired
	private AdidasProductRepository adidasProductRepository;
    @Autowired
    private JmsTemplate jmsTemplate;
    
    
	public AdidasProduct saveorUpdateProductData(AdidasProduct adidasProduct) {
		return adidasProductRepository.save(adidasProduct);
	}
	
	public Optional<AdidasProduct> getProductDatabyId(String id) {
		return adidasProductRepository.findById(id);
	}
	
	public List<AdidasProduct> getAllProducts(){
		return (List<AdidasProduct>) adidasProductRepository.findAll();
	}
	
	 public void sendMessage(String id) {
	        Map<String, String> actionmap = new HashMap<>();
	        actionmap.put("id", id);
	        //log.info("Sending the index request through queue message");
	        jmsTemplate.convertAndSend("Adidas-product-save", actionmap);
	    }
}
