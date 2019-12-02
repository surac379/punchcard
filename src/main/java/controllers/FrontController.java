package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Date;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import beans.User;
import service.UserService;

public class FrontController extends HttpServlet {

	private UserController usercntrlr = new UserController();

	protected void dodispatch(HttpServletRequest req, HttpServletResponse resp) {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");

		if (req.getParameter("monNew") != null) {
			
			usercntrlr.InsertTimesheet(req, resp);	
			//Cookie ck = new Cookie("save", "1");
			resp.setStatus(204);
		}
				
		int userId = (int) req.getSession().getAttribute("userid");
		resp.getWriter().println(new ObjectMapper().writeValueAsString(usercntrlr.findTimesheetsByUser(userId)));
		// usercntrlr.findTimesheetsByUser(userId);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = usercntrlr.findByUsername(username, password);
		if (user != null) {
			req.getSession().setAttribute("user", username);
			req.getSession().setAttribute("userid", user.getId());
			RequestDispatcher rd = req.getRequestDispatcher("mytimesheets.html");
			rd.forward(req, resp);

		} else

		{
			RequestDispatcher rd = req.getRequestDispatcher("login.html?invalid=1");
			rd.forward(req, resp);
		}

	}

}
