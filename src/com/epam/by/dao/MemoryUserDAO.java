/**
 * 
 */
package com.epam.by.dao;

import java.util.HashMap;
import java.util.Map;

import com.epam.by.beans.User;
import com.epam.by.ifaces.IUserDAO;

/**
 * @author Andrei Yahorau
 *
 */
public class MemoryUserDAO implements IUserDAO {

	private static Map<User, String> users;

	static {

		users = new HashMap<User, String>();
		users.put(new User("sysadmin"), "111");
		users.put(new User("clever"), "111");
		users.put(new User("ternal"), "111");
		users.put(new User("user"), "user");

	}

	@Override
	public boolean isUserExist(String login, String password) {

		for (Map.Entry<User, String> user : users.entrySet()) {
			if (user.getKey().getLogin().equals(login) && user.getValue().equals(password)) {
				return true;
			}
		}

		return false;
	}

}
