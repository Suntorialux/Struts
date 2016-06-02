/**
 * 
 */
package com.epam.by.tags;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.epam.by.beans.Customer;
import com.epam.by.beans.FareFamily;
import com.epam.by.beans.Reservation;
import com.epam.by.factories.DAOFactory;
import com.epam.by.ifaces.IReservationDAO;

/**
 * @author Andrei Yahorau
 *
 */
@SuppressWarnings("serial")
public class ReservationTag extends TagSupport {

	private String component;

	public void setComponent(String component) {
		this.component = component;
	}

	@Override
	public int doStartTag() throws JspException {

		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		ServletContext context = request.getSession().getServletContext();
		String fileName = context.getRealPath("/WEB-INF/" + "Reservations.xml");
		IReservationDAO iXmlDAO = DAOFactory.getClassFromFactory();
		Reservation reservation = iXmlDAO.getReservation(fileName);
		switch (component) {
		case "reservation": {
			pageContext.setAttribute("reservation", reservation);
			break;
		}
		case "customer": {
			List<Customer> customers = reservation.getCustomers();
			pageContext.setAttribute("customers", customers);
		}
		case "fareFamily": {
			List<FareFamily> fareFamilies = reservation.getFareFamilies();
			pageContext.setAttribute("fareFamilies", fareFamilies);
		}

		}
		return SKIP_BODY;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.jsp.tagext.TagSupport#doEndTag()
	 */
	@Override
	public int doEndTag() throws JspException {

		return EVAL_PAGE;
	}

}
