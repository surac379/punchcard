package beans;

public class User {
	private int id;
	private String f_name;
	private String l_name;
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
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
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
		return "User [f_name=" + f_name + ", l_name=" + l_name + ", role=" + role + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String f_name, String l_name, String userName, String password, String jobTitle, String role) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.userName = userName;
		this.password = password;
		this.jobTitle = jobTitle;
		this.role = role;
	}
	
	
	
	

}
