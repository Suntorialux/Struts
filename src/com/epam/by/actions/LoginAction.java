/**
 * 
 */
package com.epam.by.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.epam.by.beans.User;
import com.epam.by.factories.UserFactory;
import com.epam.by.forms.LoginForm;
import com.epam.by.ifaces.IUserDAO;

/**
 * @author Andrei Yahorau
 *
 */
public class LoginAction extends Action {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.
	 * ActionMapping, org.apache.struts.action.ActionForm,
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		LoginForm loginForm = (LoginForm) form;
		ActionForward forward = mapping.getInputForward();
		String login = loginForm.getLogin();
		String password = loginForm.getPassword();
		IUserDAO userDAO = UserFactory.getClassFromFactory();
		if (userDAO.isUserExist(login, password)) {
			User user = new User(login);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			forward = mapping.findForward("success");
		} else {
			ActionErrors errors = new ActionErrors();
			errors.add("login", new ActionMessage("reg.error.parameters.exists"));
			saveErrors(request, errors);
		}

		return forward;
	}

}
