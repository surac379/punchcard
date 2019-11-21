package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	protected void dodispatch(HttpServletRequest req, HttpServletResponse resp) {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dodispatch(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (validLogin(username, password)) {

			
			RequestDispatcher rd = req.getRequestDispatcher("mytimesheets.html");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("login.html?invalid=1");
			rd.forward(req, resp);		
		}
			
			

	}

	public boolean validLogin(String username, String password) {

		 
		return false;
	}

}
