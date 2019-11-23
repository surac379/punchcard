package controllers;

import java.util.List;

import beans.Timesheet;
import beans.User;
import service.UserService;

public class UserController {
	
	private UserService userService = new UserService();
	public User findByUsername(String username, String password) {
		return userService.findByUsername(username, password);
	}
	public List<Timesheet> findTimesheetsByUser(int userId){
		return userService.findTimesheetsByUser(userId);	
	}
	

}
