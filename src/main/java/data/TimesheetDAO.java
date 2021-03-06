package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import beans.Timesheet;
import beans.User;

public class TimesheetDAO {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timesheets", "root", "root");
			return conn;
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public User findByUsername(String username, String password) {
		Connection conn = getConnection();
		String sql = "select u.userid,u.f_name,u.l_name,u.user_name, u.password, u.job_title, ur.role from users u"
				+ " inner join userrole ur on u.roleid=ur.roleid where user_name = ? and password = ? ";
		User user = null;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next() == true) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7));
			}

		} catch (SQLException e) {

			throw new RuntimeException(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}

		}
		return user;

	}

	public List<Timesheet> findTimesheetsByUser(int id) {
		Connection conn = getConnection();
		LinkedList<Timesheet> list = new LinkedList<>();
		Timesheet timesheet = null;
		String str = "select t.TimesheetID, t.Mon_hrs,t.Tues_hrs,t.Wed_hrs,t.Thurs_hrs,t.Fri_hrs,t.Sat_hrs,t.Sun_hrs, t.Week_endingDate, t.ApprovedDate, s.Description as status "
				+ " from timesheet t " + "inner join Status s on t.statusID=s.statusID "
				+ "where t.userid = ? order by t.Week_endingDate";
		try {
			PreparedStatement stmt = conn.prepareStatement(str);
			stmt.setInt(1, id);
			System.out.println(id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				timesheet = new Timesheet();
				timesheet.setTimesheeetID(rs.getInt(1));
				timesheet.setMon_hrs(rs.getFloat(2));
				timesheet.setTues_hrs(rs.getFloat(3));
				timesheet.setWed_hrs(rs.getFloat(4));
				timesheet.setThurs_hrs(rs.getFloat(5));
				timesheet.setFri_hrs(rs.getFloat(6));
				timesheet.setSat_hrs(rs.getFloat(7));
				timesheet.setSun_hrs(rs.getFloat(8));
				timesheet.setWeekendingDate(rs.getString(9));
				timesheet.setApprovedDate(rs.getString(10));
				timesheet.setStatus(rs.getString(11));

				list.add(timesheet);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}

		}

		return list;
	}

	public Timesheet findTimesheetById(int id) {
		Timesheet timesheet = null;
		Connection conn = getConnection();
		String str = "select t.TimesheetID, t.Mon_hrs,t.Tues_hrs,t.Wed_hrs,t.Thurs_hrs,t.Fri_hrs,t.Sat_hrs,t.Sun_hrs, t.Week_endingDate, t.ApprovedDate, s.Description as status "
				+ " from timesheet t " + "inner join Status s on t.statusID=s.statusID " + "where t.timesheetID = ?";

		try {
			PreparedStatement stmt = conn.prepareStatement(str);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next() == true) {

				timesheet.setTimesheeetID(rs.getInt(1));
				timesheet.setMon_hrs(rs.getFloat(2));
				timesheet.setTues_hrs(rs.getFloat(3));
				timesheet.setWed_hrs(rs.getFloat(4));
				timesheet.setThurs_hrs(rs.getFloat(5));
				timesheet.setFri_hrs(rs.getFloat(6));
				timesheet.setSat_hrs(rs.getFloat(7));
				timesheet.setSun_hrs(rs.getFloat(8));	
				timesheet.setWeekendingDate(rs.getString(9));
				timesheet.setApprovedDate(rs.getString(10));
				timesheet.setStatus(rs.getString(11));
			}

		}

		catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}

		}

		return timesheet;
	}

	public void SaveTimesheet(Timesheet timesheet) {
		Connection conn = getConnection();

	}

	public int InsertTimesheet(Timesheet timesheet, int userId) {
		
		int TimesheetId = 0;
		Connection conn = getConnection();
		String str = "insert into timesheet "
				+ "(userID,statusID,Mon_hrs,Tues_hrs,Wed_hrs,Thurs_hrs,Fri_hrs,Sat_hrs,Sun_hrs,Week_Endingdate) "
				+ "values ( ? ,?,?,?,?,?,?,?,?,?)";
		try {
			
			PreparedStatement stmt = conn.prepareStatement(str, new String[] { "timesheetId" });
			stmt.setInt(1, userId);
			stmt.setInt(2, timesheet.getStautusID());
			stmt.setFloat(3, timesheet.getMon_hrs());
			stmt.setFloat(4, timesheet.getTues_hrs());
			stmt.setFloat(5, timesheet.getWed_hrs());
			stmt.setFloat(6, timesheet.getThurs_hrs());
			stmt.setFloat(7, timesheet.getFri_hrs());
			stmt.setFloat(8, timesheet.getSat_hrs());
			stmt.setFloat(9, timesheet.getSun_hrs());
			stmt.setString(10, timesheet.getWeekendingDate());

			stmt.executeUpdate();
			
			ResultSet keys = stmt.getGeneratedKeys();
			while (keys.next()) {
				TimesheetId = keys.getInt(1);
			}
				

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
		}
		return TimesheetId;
		
	}
	
	
}
