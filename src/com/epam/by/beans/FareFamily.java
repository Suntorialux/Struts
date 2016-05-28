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
@XmlRootElement(name = "FareFamily")
@XmlAccessorType(XmlAccessType.FIELD)
public class FareFamily {

	@XmlAttribute(name = "FareFamilyCode")
	private String fareFamilyCode;

	@XmlElement(name = "AncillaryAirComponent")
	private List<AncillaryAirComponent> components = new ArrayList<>();

	public FareFamily() {
	}

	/**
	 * @param fareFamilyCode
	 * @param components
	 */
	public FareFamily(String fareFamilyCode, List<AncillaryAirComponent> components) {
		this.fareFamilyCode = fareFamilyCode;
		this.components = components;
	}

	/**
	 * @return the fareFamilyCode
	 */
	public String getFareFamilyCode() {
		return fareFamilyCode;
	}

	/**
	 * @param fareFamilyCode
	 *            the fareFamilyCode to set
	 */
	public void setFareFamilyCode(String fareFamilyCode) {
		this.fareFamilyCode = fareFamilyCode;
	}

	/**
	 * @return the components
	 */
	public List<AncillaryAirComponent> getComponents() {
		return components;
	}

	/**
	 * @param components
	 *            the components to set
	 */
	public void setComponents(List<AncillaryAirComponent> components) {
		this.components = components;
	}

	@XmlRootElement(name = "AncillaryAirComponent")
	@XmlAccessorType(XmlAccessType.FIELD)
	public static class AncillaryAirComponent {

		@XmlAttribute(name = "AncillaryAirComponentCode")
		private String ancillaryAirComponentCode;

		public AncillaryAirComponent() {
		}

		/**
		 * @param ancillaryAirComponentCode
		 */
		public AncillaryAirComponent(String ancillaryAirComponentCode) {
			this.ancillaryAirComponentCode = ancillaryAirComponentCode;
		}

		/**
		 * @return the ancillaryAirComponentCode
		 */
		public String getAncillaryAirComponentCode() {
			return ancillaryAirComponentCode;
		}

		/**
		 * @param ancillaryAirComponentCode
		 *            the ancillaryAirComponentCode to set
		 */
		public void setAncillaryAirComponentCode(String ancillaryAirComponentCode) {
			this.ancillaryAirComponentCode = ancillaryAirComponentCode;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "AncillaryAirComponent [ancillaryAirComponentCode=" + ancillaryAirComponentCode + "]";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FareFamily [fareFamilyCode=" + fareFamilyCode + ", components=" + components + "]";
	}

}
