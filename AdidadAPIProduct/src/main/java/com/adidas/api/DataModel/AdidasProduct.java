package com.adidas.api.DataModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class AdidasProduct {
	@Id
	private String id;
	private String name;
	private String model_number;
	private String product_type;

	@JsonProperty("meta_data")
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="metaId")
	private MetaData meta_data;
	
	@JsonProperty("pricing_information")
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="priceinfoId")
	private PricingInformation pricing_information;
	
	@JsonProperty("product_description")
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="descId")
	private ProductDescription product_description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel_number() {
		return model_number;
	}

	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public MetaData getMeta_data() {
		return meta_data;
	}

	public void setMeta_data(MetaData meta_data) {
		this.meta_data = meta_data;
	}

	public PricingInformation getPricing_information() {
		return pricing_information;
	}

	public void setPricing_information(PricingInformation pricing_information) {
		this.pricing_information = pricing_information;
	}

	public ProductDescription getProduct_description() {
		return product_description;
	}

	public void setProduct_description(ProductDescription product_description) {
		this.product_description = product_description;
	}


}
