package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Timesheet;
import beans.User;
import data.TimesheetDAO;

public class UserService  {
	private TimesheetDAO dao = new TimesheetDAO();
	public User findByUsername(String username,String password) {
		return dao.findByUsername(username, password);
	}
	
	public List<Timesheet> findTimesheetsByUser(int userId) {
		return dao.findTimesheetsByUser(userId);
	}
	
	
}
