package com.adidas.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.adidas.api.DataModel.AdidasProduct;

public interface AdidasProductRepository extends CrudRepository<AdidasProduct, String>{

}
