package beans;

public class Timesheet {
	
	private int timesheeetID;
	private int stautusID;
	private float Mon_hrs;
	private float Tues_hrs;
	private float Wed_hrs;
	private float Thurs_hrs;
	private float Fri_hrs;
	private float Sat_hrs;
	private float Sun_hrs;
	private String weekendingDate; 
	private String approvedDate;
	public int getTimesheeetID() {
		return timesheeetID;
	}
	public void setTimesheeetID(int timesheeetID) {
		this.timesheeetID = timesheeetID;
	}
	public int getStautusID() {
		return stautusID;
	}
	public void setStautusID(int stautusID) {
		this.stautusID = stautusID;
	}
	public float getMon_hrs() {
		return Mon_hrs;
	}
	public void setMon_hrs(float mon_hrs) {
		Mon_hrs = mon_hrs;
	}
	public float getTues_hrs() {
		return Tues_hrs;
	}
	public void setTues_hrs(float tues_hrs) {
		Tues_hrs = tues_hrs;
	}
	public float getWed_hrs() {
		return Wed_hrs;
	}
	public void setWed_hrs(float wed_hrs) {
		Wed_hrs = wed_hrs;
	}
	public float getThurs_hrs() {
		return Thurs_hrs;
	}
	public void setThurs_hrs(float thurs_hrs) {
		Thurs_hrs = thurs_hrs;
	}
	public float getFri_hrs() {
		return Fri_hrs;
	}
	public void setFri_hrs(float fri_hrs) {
		Fri_hrs = fri_hrs;
	}
	public float getSat_hrs() {
		return Sat_hrs;
	}
	public void setSat_hrs(float sat_hrs) {
		Sat_hrs = sat_hrs;
	}
	public float getSun_hrs() {
		return Sun_hrs;
	}
	public void setSun_hrs(float sun_hrs) {
		Sun_hrs = sun_hrs;
	}
	public String getWeekendingDate() {
		return weekendingDate;
	}
	public void setWeekendingDate(String weekendingDate) {
		this.weekendingDate = weekendingDate;
	}
	public String getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}
	public Timesheet(int timesheeetID, int stautusID, float mon_hrs, float tues_hrs, float wed_hrs, float thurs_hrs,
			float fri_hrs, float sat_hrs, float sun_hrs, String weekendingDate, String approvedDate) {
		super();
		this.timesheeetID = timesheeetID;
		this.stautusID = stautusID;
		Mon_hrs = mon_hrs;
		Tues_hrs = tues_hrs;
		Wed_hrs = wed_hrs;
		Thurs_hrs = thurs_hrs;
		Fri_hrs = fri_hrs;
		Sat_hrs = sat_hrs;
		Sun_hrs = sun_hrs;
		this.weekendingDate = weekendingDate;
		this.approvedDate = approvedDate;
	}
	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Timesheet [timesheeetID=" + timesheeetID + ", stautusID=" + stautusID + ", weekendingDate="
				+ weekendingDate + "]";
	}
	
}
