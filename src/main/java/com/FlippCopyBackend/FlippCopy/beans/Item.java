package com.FlippCopyBackend.FlippCopy.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Items")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private double price;
	
	@Column
	private String category;
	
	@Column
	private double discount;
	
	@Column
	private int companyId;
	
	private String companyName;
	private String companyLogo;
	
	
	
	

	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "coupon_id", nullable = false)
	private Coupon coupon;
	
	
	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getCompanyLogo() {
		return companyLogo;
	}



	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}



	public Coupon getCoupon() {
		return coupon;
	}



	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public int getCompanyId() {
		return companyId;
	}



	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}



	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}







	public void setPrice(int price) {
		this.price = price;
	}






	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public void setDiscount(int discount) {
		this.discount = discount;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", discount="
				+ discount + "]";
	}



	
	
	

	
}
