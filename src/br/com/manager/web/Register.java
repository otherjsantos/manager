package br.com.manager.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register implements Task {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		return "WEB-INF/pages/empresaCadastrada.jsp";
	}

}
