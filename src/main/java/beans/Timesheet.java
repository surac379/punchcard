package beans;

public class Timesheet {
	
	private int timesheeetID;
	private int stautusID;
	private float monHrs;
	private float tuesHrs;
	private float wedHrs;
	private float thursHrs;
	private float friHrs;
	private float satHrs;
	private float sunHrs;
	private String weekendingDate; 
	private String approvedDate;
	private String status;
	
	
	public Timesheet(int timesheeetID, float mon_hrs, float tues_hrs, float wed_hrs, float thurs_hrs, float fri_hrs,
			float sat_hrs, float sun_hrs, String weekendingDate, String approvedDate, String status) {
		super();
		this.timesheeetID = timesheeetID;
		monHrs = mon_hrs;
		tuesHrs = tues_hrs;
		wedHrs = wed_hrs;
		thursHrs = thurs_hrs;
		friHrs = fri_hrs;
		satHrs = sat_hrs;
		sunHrs = sun_hrs;
		this.weekendingDate = weekendingDate;
		this.approvedDate = approvedDate;
		this.status = status;
	}

	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
		return monHrs;
	}
	public void setMon_hrs(float mon_hrs) {
		monHrs = mon_hrs;
	}
	public float getTues_hrs() {
		return tuesHrs;
	}
	public void setTues_hrs(float tues_hrs) {
		tuesHrs = tues_hrs;
	}
	public float getWed_hrs() {
		return wedHrs;
	}
	public void setWed_hrs(float wed_hrs) {
		wedHrs = wed_hrs;
	}
	public float getThurs_hrs() {
		return thursHrs;
	}
	public void setThurs_hrs(float thurs_hrs) {
		thursHrs = thurs_hrs;
	}
	public float getFri_hrs() {
		return friHrs;
	}
	public void setFri_hrs(float fri_hrs) {
		friHrs = fri_hrs;
	}
	public float getSat_hrs() {
		return satHrs;
	}
	public void setSat_hrs(float sat_hrs) {
		satHrs = sat_hrs;
	}
	public float getSun_hrs() {
		return sunHrs;
	}
	public void setSun_hrs(float sun_hrs) {
		sunHrs = sun_hrs;
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
		monHrs = mon_hrs;
		tuesHrs = tues_hrs;
		wedHrs = wed_hrs;
		thursHrs = thurs_hrs;
		friHrs = fri_hrs;
		satHrs = sat_hrs;
		sunHrs = sun_hrs;
		this.weekendingDate = weekendingDate;
		this.approvedDate = approvedDate;
	}
	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Timesheet [timesheeetID=" + timesheeetID + ", monHrs=" + monHrs + ", tuesHrs=" + tuesHrs + ", wedHrs="
				+ wedHrs + ", thursHrs=" + thursHrs + ", friHrs=" + friHrs + ", satHrs=" + satHrs + ", sunHrs=" + sunHrs
				+ ", weekendingDate=" + weekendingDate + ", status=" + status + "]";
	}
	
	
	
	
}
