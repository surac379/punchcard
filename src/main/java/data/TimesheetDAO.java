package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

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

	public void getUserAuth() throws SQLException {
		Connection conn = getConnection();
		String sql = "select * from insert";

	}

	public User findByUsername(String username) {
		Connection conn = getConnection();
		String sql = "select u.f_name,u.l_name,u.user_name, u.password, u.job_title, ur.role from users "
				+ "inner join userrole ur on u.roleid=ur.roleid where user_name = ?";
		User user = null;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, username);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			user = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
			
		} catch (SQLException e) {

			e.printStackTrace();
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
	// public List<Timesheet> findTimesheetsByUser(int id) {}
	// public Timesheet findTimesheetById(int ID) {}
	// public Timesheet save(Timesheet t) { }

}
