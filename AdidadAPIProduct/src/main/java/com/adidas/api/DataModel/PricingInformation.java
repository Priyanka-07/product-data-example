package com.adidas.api.DataModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PricingInformation {
	@Id
	@GeneratedValue
    private int priceinfoId;
	
	private double standard_price;
	private double standard_price_no_vat;
	public double getStandard_price() {
		return standard_price;
	}
	public void setStandard_price(double standard_price) {
		this.standard_price = standard_price;
	}
	public double getStandard_price_no_vat() {
		return standard_price_no_vat;
	}
	public void setStandard_price_no_vat(double standard_price_no_vat) {
		this.standard_price_no_vat = standard_price_no_vat;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	private double currentPrice;
}
