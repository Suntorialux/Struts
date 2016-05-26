/**
 * 
 */
package com.epam.by.ifaces;

/**
 * @author Andrei Yahorau
 *
 */
public interface IUserDAO {

	boolean isUserExist(String login, String password);

}
