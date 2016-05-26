/**
 * 
 */
package com.epam.by.factories;

import com.epam.by.dao.XmlDAO;
import com.epam.by.ifaces.IXmlDAO;

/**
 * @author Andrei Yahorau
 *
 */
public class DAOFactory {
	public static IXmlDAO getClassFromFactory() {
		return new XmlDAO();
	}
}
