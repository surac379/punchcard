package beans;

public class User {
	private int id;
	private String fName;
	private String lName;
	private String userName;
	private String password;
	private String jobTitle;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return fName;
	}
	public void setF_name(String f_name) {
		this.fName = f_name;
	}
	public String getL_name() {
		return lName;
	}
	public void setL_name(String l_name) {
		this.lName = l_name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [f_name=" + fName + ", l_name=" + lName + ", role=" + role + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String f_name, String l_name, String userName, String password, String jobTitle, String role) {
		super();
		this.fName = f_name;
		this.lName = l_name;
		this.userName = userName;
		this.password = password;
		this.jobTitle = jobTitle;
		this.role = role;
	}
	public User(int id, String fName, String lName, String userName, String password, String jobTitle, String role) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.password = password;
		this.jobTitle = jobTitle;
		this.role = role;
	}
	
	
	
	

}
