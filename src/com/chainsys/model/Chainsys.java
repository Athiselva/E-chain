package com.chainsys.model;

import java.sql.Date;
import java.time.LocalDate;

public class Chainsys {

	private int employeeId;
	private String email;
	private String name;
	private String username;
	private String password;
	private long phonenumber;
	private boolean flag;
	private String position;
	private LocalDate dob;

	public static int id;
	public static String empname;
	public static String email2;

	private String update;
	private String value;
	private int timesheetNumber;

	private String presentHours;
	private String status;
	private String reason;
	private String approval;
	private LocalDate fromDate;
	private LocalDate todate;
	private LocalDate ondate;
	public static LocalDate ondate2;

	
	public static String getEmail2() {
		return email2;
	}

	public static void setEmail2(String email2) {
		Chainsys.email2 = email2;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getTimesheetNumber() {
		return timesheetNumber;
	}

	public void setTimesheetNumber(int timesheetNumber) {
		this.timesheetNumber = timesheetNumber;
	}

	public static LocalDate getOndate2() {
		return ondate2;
	}

	public static void setOndate2(LocalDate ondate2) {
		Chainsys.ondate2 = ondate2;
	}

	private String task;
	private String taskStatus;
	private String timeSheetStatus;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTimeSheetStatus() {
		return timeSheetStatus;
	}

	public void setTimeSheetStatus(String timeSheetStatus) {
		this.timeSheetStatus = timeSheetStatus;
	}

	public static String getEmpname() {
		return empname;
	}

	public static void setEmpname(String empname) {
		Chainsys.empname = empname;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getTodate() {
		return todate;
	}

	public void setTodate(LocalDate todate) {
		this.todate = todate;
	}

	public LocalDate getOndate() {
		return ondate;
	}

	public void setOndate(LocalDate ondate) {
		this.ondate = ondate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPresentHours() {
		return presentHours;
	}

	public void setPresentHours(String presentHours) {
		this.presentHours = presentHours;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static String username2;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Chainsys.id = id;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getUsername2() {
		return username2;
	}

	public static void setUsername2(String username2) {
		Chainsys.username2 = username2;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
