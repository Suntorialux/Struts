/**
 * 
 */
package com.epam.by.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Andrei Yahorau
 *
 */

@XmlRootElement(name = "Reservation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {

	@XmlAttribute(name = "Code")
	private String code;

	@XmlAttribute(name = "Description")
	private String description;

	@XmlElement(name = "ResComponent")
	private List<ResComponents> resComponents = new ArrayList<>();

	@XmlElement(name = "Customer")
	private List<Customer> customers = new ArrayList<>();

	@XmlElement(name = "FareFamily")
	private List<FareFamily> fareFamilies = new ArrayList<>();

	public Reservation() {
	}

	/**
	 * @param code
	 * @param description
	 * @param resComponents
	 * @param customers
	 * @param fareFamilies
	 */
	public Reservation(String code, String description, List<ResComponents> resComponents, List<Customer> customers, List<FareFamily> fareFamilies) {
		this.code = code;
		this.description = description;
		this.resComponents = resComponents;
		this.customers = customers;
		this.fareFamilies = fareFamilies;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the resComponents
	 */
	public List<ResComponents> getResComponents() {
		return resComponents;
	}

	/**
	 * @param resComponents
	 *            the resComponents to set
	 */
	public void setResComponents(List<ResComponents> resComponents) {
		this.resComponents = resComponents;
	}

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers
	 *            the customers to set
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	/**
	 * @return the fareFamilies
	 */
	public List<FareFamily> getFareFamilies() {
		return fareFamilies;
	}

	/**
	 * @param fareFamilies
	 *            the fareFamilies to set
	 */
	public void setFareFamilies(List<FareFamily> fareFamilies) {
		this.fareFamilies = fareFamilies;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Reservation [code=" + code + ", description=" + description + ", resComponents=" + resComponents + ", customers=" + customers + ", fareFamilies=" + fareFamilies + "]";
	}
}
