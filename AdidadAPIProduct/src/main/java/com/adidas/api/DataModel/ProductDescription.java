package com.adidas.api.DataModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductDescription {
	
@Id
@GeneratedValue
private int descId;

private String title;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getSubtitle() {
	return subtitle;
}
public void setSubtitle(String subtitle) {
	this.subtitle = subtitle;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
private String subtitle;
private String text;

}
