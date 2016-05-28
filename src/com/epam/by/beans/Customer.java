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
@XmlRootElement(name = "Customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

	/** The first name of customer */
	@XmlAttribute(name = "FirstName")
	private String firstName;

	/** The last name of customer */
	@XmlAttribute(name = "LastName")
	private String lastName;

	/** The email of customer */
	@XmlElement(name = "Email")
	private Email email;

	/** The phone of customer */
	@XmlElement(name = "Phone")
	private Phone phone;

	/** The customer's list of payments */
	@XmlElement(name = "Payment")
	private List<Payment> payments = new ArrayList<>();

	@XmlRootElement(name = "Email")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class Email {

		@XmlAttribute(name = "EmailAddress")
		private String emailAddress;

		public Email() {
		}

		/**
		 * @param emailAddress
		 */
		public Email(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		/**
		 * @return the emailAddress
		 */
		public String getEmailAddress() {
			return emailAddress;
		}

		/**
		 * @param emailAddress
		 *            the emailAddress to set
		 */
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return emailAddress;
		}
	}

	@XmlRootElement(name = "Phone")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class Phone {

		@XmlAttribute(name = "PhoneNumber")
		private String phoneNumber;

		public Phone() {
		}

		/**
		 * @param phoneNumber
		 */
		public Phone(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		/**
		 * @return the phoneNumber
		 */
		public String getPhoneNumber() {
			return phoneNumber;
		}

		/**
		 * @param phoneNumber
		 *            the phoneNumber to set
		 */
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return phoneNumber;
		}
	}

	public Customer() {
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phone
	 * @param payments
	 */
	public Customer(String firstName, String lastName, Email email, Phone phone, List<Payment> payments) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.payments = payments;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public Phone getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	/**
	 * @return the payments
	 */
	public List<Payment> getPayments() {
		return payments;
	}

	/**
	 * @param payments
	 *            the payments to set
	 */
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", payments=" + payments + "]";
	}

}
