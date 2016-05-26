/**
 * 
 */
package com.epam.by.tags;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.epam.by.beans.Reservation;
import com.epam.by.factories.DAOFactory;
import com.epam.by.ifaces.IXmlDAO;

/**
 * @author Andrei Yahorau
 *
 */
@SuppressWarnings("serial")
public class ReservationTag extends TagSupport {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
	 */
	@Override
	public int doStartTag() throws JspException {

		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		ServletContext context = request.getSession().getServletContext();
		String fileName = context.getRealPath("/WEB-INF/" + "Reservations.xml");
		System.out.println(fileName);
		IXmlDAO iXmlDAO = DAOFactory.getClassFromFactory();
		Reservation reservation = iXmlDAO.getReservation(fileName);
		System.out.println(reservation);
		pageContext.setAttribute("reservation", reservation);
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
