/**
 * 
 */
package com.epam.by.beans;

/**
 * @author Andrei Yahorau
 *
 */
public class User {

	/** The login of user */
	private String login;

	/**
	 * 
	 */
	public User() {
	}

	/**
	 * @param login
	 */
	public User(String login) {
		this.login = login;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

}
