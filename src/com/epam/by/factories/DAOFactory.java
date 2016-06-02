/**
 * 
 */
package com.epam.by.factories;

import com.epam.by.dao.XmlDAO;
import com.epam.by.ifaces.IReservationDAO;

/**
 * @author Andrei Yahorau
 *
 */
public class DAOFactory {
	public static IReservationDAO getClassFromFactory() {
		return new XmlDAO();
	}
}
