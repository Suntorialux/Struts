/**
 * 
 */
package com.epam.by.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Andrei Yahorau
 *
 */
@XmlRootElement(name = "Payment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment {

	/** The amount of paid */
	@XmlAttribute(name = "AmountPaid")
	private double amountPaid;

	/** The form of payment type code */
	@XmlAttribute(name = "FormOfPaymentTypeCode")
	private String typeCode;

	/** The currency code */
	@XmlAttribute(name = "CurrencyCode")
	private String currencyCode;

	public Payment() {
	}

	/**
	 * @param amountPaid
	 * @param typeCode
	 * @param currencyCode
	 */
	public Payment(double amountPaid, String typeCode, String currencyCode) {
		this.amountPaid = amountPaid;
		this.typeCode = typeCode;
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the amountPaid
	 */
	public double getAmountPaid() {
		return amountPaid;
	}

	/**
	 * @param amountPaid
	 *            the amountPaid to set
	 */
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	/**
	 * @return the typeCode
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * @param typeCode
	 *            the typeCode to set
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode
	 *            the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payment [amountPaid=" + amountPaid + ", typeCode=" + typeCode + ", currencyCode=" + currencyCode + "]";
	}

}
