package com.jlcindia.hibernate;

import javax.persistence.*;
@Entity
@Table(name="addresses")
public class Address {
	@Id
	@Column(name="aid")
	@GeneratedValue(strategy=GenerationType.AUTO)
private int aid;
	@Column(name="street")
private String street;
	@Column(name="city")
private String city;
	@Column(name="state")
private String state;
	@OneToOne
	@JoinColumn(name="aid")
private Customer customer;
	public Address() {}
	public Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
