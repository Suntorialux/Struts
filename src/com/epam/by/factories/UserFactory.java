/**
 * 
 */
package com.epam.by.factories;

import com.epam.by.dao.MemoryUserDAO;
import com.epam.by.ifaces.IUserDAO;

/**
 * @author Andrei Yahorau
 *
 */
public class UserFactory {
	public static IUserDAO getClassFromFactory() {
		return new MemoryUserDAO();
	}
}
