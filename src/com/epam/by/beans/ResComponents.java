package com.epam.by.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResComponent")
public class ResComponents {

	@XmlAttribute(name = "ComponentTypeCode")
	private String componentTypeCode;

	@XmlAttribute(name = "CreateDateTime")
	private String createDateTime;

	@XmlAttribute(name = "InternalStatus")
	private InternalStatus internalStatus;

	public ResComponents() {
	}

	/**
	 * @param componentTypeCode
	 * @param createDateTime
	 * @param internalStatus
	 */
	public ResComponents(String componentTypeCode, String createDateTime, InternalStatus internalStatus) {
		this.componentTypeCode = componentTypeCode;
		this.createDateTime = createDateTime;
		this.internalStatus = internalStatus;
	}

	/**
	 * @return the componentTypeCode
	 */
	public String getComponentTypeCode() {
		return componentTypeCode;
	}

	/**
	 * @param componentTypeCode
	 *            the componentTypeCode to set
	 */
	public void setComponentTypeCode(String componentTypeCode) {
		this.componentTypeCode = componentTypeCode;
	}

	/**
	 * @return the createDateTime
	 */
	public String getCreateDateTime() {
		return createDateTime;
	}

	/**
	 * @param createDateTime
	 *            the createDateTime to set
	 */
	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}

	/**
	 * @return the internalStatus
	 */
	public InternalStatus getInternalStatus() {
		return internalStatus;
	}

	/**
	 * @param internalStatus
	 *            the internalStatus to set
	 */
	public void setInternalStatus(InternalStatus internalStatus) {
		this.internalStatus = internalStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResComponent [componentTypeCode=" + componentTypeCode + ", createDateTime=" + createDateTime + ", internalStatus=" + internalStatus + "]\n";
	}

}
