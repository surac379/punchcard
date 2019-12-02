package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	public void InsertTimesheet(HttpServletRequest req, HttpServletResponse resp) {
		int userId = (int) req.getSession().getAttribute("userid");
		
		float monHrs = Float.parseFloat(req.getParameter("monNew"));
		float tueHrs = Float.parseFloat(req.getParameter("tueNew"));
		float wedHrs = Float.parseFloat(req.getParameter("wedNew"));
		float thuHrs = Float.parseFloat(req.getParameter("thuNew"));
		float friHrs = Float.parseFloat(req.getParameter("friNew"));
		float satHrs = Float.parseFloat(req.getParameter("satNew"));
		float sunHrs = Float.parseFloat(req.getParameter("sunNew"));
		String weekEndDate = req.getParameter("dateNew");
		
		Timesheet timesheet = new Timesheet();
		timesheet.setStautusID(2);
		timesheet.setMon_hrs(monHrs);
		timesheet.setTues_hrs(tueHrs);
		timesheet.setWed_hrs(wedHrs);
		timesheet.setThurs_hrs(thuHrs);
		timesheet.setFri_hrs(friHrs);
		timesheet.setSat_hrs(satHrs);
		timesheet.setSun_hrs(sunHrs);
		timesheet.setWeekendingDate(weekEndDate);
		int newTimesheetId = userService.InsertTimesheet(timesheet, userId);
		timesheet.setTimesheeetID(newTimesheetId);
				
	}
	
}
