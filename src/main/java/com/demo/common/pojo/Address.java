package com.demo.common.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//ADDRESS class can be used as a xml or json object although annotated with xml annotations

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
	
	@XmlAttribute
	private int id;
	
	@XmlElement(name="STREETADDRESS")
	private String streetAddress;
	
	@XmlElement
	private String city;
	
	@XmlElement
	private String state;
	
	@XmlElement
	private String zip;
	
	@XmlElement
	private String country;
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}