package com.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.model.Chainsys;
import com.chainsys.util.ConnectionUtil;

public class ChainsysDAO {

	public Boolean login(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select username,password from chainsys where username=? and password=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, chainsys.getUsername());
			preparedStatement.setString(2, chainsys.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				if (resultSet.getString("username").equalsIgnoreCase(
						chainsys.getUsername())
						&& resultSet.getString("password").equalsIgnoreCase(
								chainsys.getPassword())) {
					chainsys.setFlag(true);
				} else {
					chainsys.setFlag(false);
				}
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Login");
		}
		return chainsys.isFlag();

	}

	public int getId(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql2 = "select employee_id from chainsys where username=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql2);
			preparedStatement.setString(1, chainsys.getUsername());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chainsys.setEmployeeId(resultSet.getInt("employee_id"));
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Get the Id");
		}
		return chainsys.getEmployeeId();
	}

	public String getEmployeeName(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql2 = "select employee_name from chainsys where username=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql2);
			preparedStatement.setString(1, chainsys.getUsername());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chainsys.setName(resultSet.getString("employee_name"));
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to get the Employee Name");
		}
		return chainsys.getName();
	}

	public String getEmail(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql2 = "select email from chainsys where username=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql2);
			preparedStatement.setString(1, chainsys.getUsername());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chainsys.setEmail(resultSet.getString("email"));
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to get the Email");
		}
		return chainsys.getEmail();
	}

	public void register(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into chainsys (employee_id,employee_name,username,password,phone_number,position,email,date_of_birth) values(chainsys_emp_id_seq43.nextval,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, chainsys.getName());
			preparedStatement.setString(2, chainsys.getUsername());
			preparedStatement.setString(3, chainsys.getPassword());
			preparedStatement.setLong(4, chainsys.getPhonenumber());
			preparedStatement.setString(5, chainsys.getPosition());
			preparedStatement.setString(6, chainsys.getEmail());
			preparedStatement.setDate(7, Date.valueOf(chainsys.getDob()));
			preparedStatement.executeQuery();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Register the Id");
		}
	}

	public ArrayList<Chainsys> attendance(Chainsys chainsys) {
		ArrayList<Chainsys> clist;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "SELECT ondate,employee_id,employee_name,present_hours,status,reason,approval FROM attendance WHERE employee_id=? and ondate BETWEEN ? AND ?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, chainsys.getEmployeeId());
			preparedStatement.setDate(2, Date.valueOf(chainsys.getFromDate()));
			preparedStatement.setDate(3, Date.valueOf(chainsys.getTodate()));

			ResultSet resultSet = preparedStatement.executeQuery();
			clist = new ArrayList<>();
			while (resultSet.next()) {
				Chainsys chainsys2 = new Chainsys();
				chainsys2
						.setOndate((resultSet.getDate("ondate").toLocalDate()));
				chainsys2.setEmployeeId(resultSet.getInt("employee_id"));
				chainsys2.setName(resultSet.getString("employee_name"));
				chainsys2.setPresentHours(resultSet.getString("present_hours"));
				chainsys2.setStatus(resultSet.getString("status"));
				chainsys2.setReason(resultSet.getString("reason"));
				chainsys2.setApproval(resultSet.getString("approval"));
				clist.add(chainsys2);
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Get the Attendance");
		}
		return clist;
	}

	public ArrayList<Chainsys> viewTimeSheet(Chainsys chainsys) {
		ArrayList<Chainsys> clist;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select ondate,task,taskstatus,timesheetstatus from timesheet where employee_id=? and ondate between ? and ?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, chainsys.getEmployeeId());
			preparedStatement.setDate(2, Date.valueOf(chainsys.getFromDate()));
			preparedStatement.setDate(3, Date.valueOf(chainsys.getTodate()));

			ResultSet resultSet = preparedStatement.executeQuery();
			clist = new ArrayList<>();
			while (resultSet.next()) {
				Chainsys chainsys2 = new Chainsys();
				chainsys2
						.setOndate((resultSet.getDate("ondate").toLocalDate()));
				chainsys2.setTask(resultSet.getString("task"));
				chainsys2.setTaskStatus(resultSet.getString("taskstatus"));
				chainsys2.setTimeSheetStatus(resultSet
						.getString("timesheetstatus"));
				clist.add(chainsys2);
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(
					"Unable to Get the Call the ViewTimesheet");
		}
		return clist;
	}

	public ArrayList<Chainsys> ondateTimeSheet(Chainsys chainsys) {
		ArrayList<Chainsys> clist;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select ondate,task,taskstatus,timesheetstatus,timesheet_number from timesheet where employee_id=? and ondate=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, chainsys.getEmployeeId());
			preparedStatement.setDate(2, Date.valueOf(chainsys.getOndate()));

			ResultSet resultSet = preparedStatement.executeQuery();
			clist = new ArrayList<>();
			while (resultSet.next()) {
				Chainsys chainsys2 = new Chainsys();
				chainsys2
						.setOndate((resultSet.getDate("ondate").toLocalDate()));
				chainsys2.setTask(resultSet.getString("task"));
				chainsys2.setTaskStatus(resultSet.getString("taskstatus"));
				chainsys2.setTimeSheetStatus(resultSet
						.getString("timesheetstatus"));
				chainsys2.setTimesheetNumber(resultSet
						.getInt("timesheet_number"));
				clist.add(chainsys2);
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call the Ondate Timesheet");
		}
		return clist;
	}

	public void timeSheets(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "update timesheet set Taskstatus=? where employee_id=? and ondate=? and timesheet_number=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, chainsys.getTaskStatus());
			preparedStatement.setInt(2, chainsys.getEmployeeId());
			preparedStatement.setDate(3, Date.valueOf(chainsys.getOndate()));
			preparedStatement.setInt(4, chainsys.getTimesheetNumber());
			preparedStatement.executeQuery();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call the Timesheets");
		}
	}

	public ArrayList<Chainsys> viewProfile(Chainsys chainsys) {
		ArrayList<Chainsys> clist = new ArrayList<>();
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select employee_name,employee_id,position,username,password,phone_number,email from chainsys where employee_id=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, chainsys.getEmployeeId());

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Chainsys chainsys2 = new Chainsys();

				chainsys2.setName(resultSet.getString("employee_name"));
				chainsys2.setEmployeeId(resultSet.getInt("employee_id"));
				chainsys2.setPosition(resultSet.getString("position"));
				chainsys2.setUsername(resultSet.getString("username"));
				chainsys2.setPassword(resultSet.getString("password"));
				chainsys2.setPhonenumber(resultSet.getLong("phone_number"));
				chainsys2.setEmail(resultSet.getString("email"));

				clist.add(chainsys2);
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call the ViewProfile");
		}
		return clist;
	}

	public void updateProfile(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "update chainsys set employee_name=?,username=?,password=?,phone_number=? where employee_id=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, chainsys.getName());
			preparedStatement.setString(2, chainsys.getUsername());
			preparedStatement.setString(3, chainsys.getPassword());
			preparedStatement.setLong(4, chainsys.getPhonenumber());
			preparedStatement.setInt(5, chainsys.getEmployeeId());
			preparedStatement.executeQuery();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call the Update Profile");
		}

	}

	public int forgetPassword(Chainsys chainsys) {
		int rows = 0;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "update chainsys set password=? where employee_id=? and username=? and phone_number=? and email=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, chainsys.getPassword());
			preparedStatement.setInt(2, chainsys.getEmployeeId());
			preparedStatement.setString(3, chainsys.getUsername());
			preparedStatement.setLong(4, chainsys.getPhonenumber());
			preparedStatement.setString(5, chainsys.getEmail());
			rows = preparedStatement.executeUpdate();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call Forget Password");

		}
		return rows;
	}

	public Boolean adminLogin(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select username,password from admin where username=? and password=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, chainsys.getAdminUsername());
			preparedStatement.setString(2, chainsys.getAdminPassword());
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				if (resultSet.getString("username").equalsIgnoreCase(
						chainsys.getAdminUsername())
						&& resultSet.getString("password").equalsIgnoreCase(
								chainsys.getAdminPassword())) {
					chainsys.setFlag(true);
				} else {
					chainsys.setFlag(false);
				}
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Login as Admin");
		}
		return chainsys.isFlag();

	}

	public int adminGetId(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql2 = "select admin_id from admin where username=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql2);
			preparedStatement.setString(1, chainsys.getAdminUsername());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chainsys.setEmployeeId(resultSet.getInt("admin_id"));
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to get the Admin Id");
		}
		return chainsys.getEmployeeId();
	}

	public String adminGetEmployeeName(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql2 = "select admin_name from admin where username=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql2);
			preparedStatement.setString(1, chainsys.getAdminUsername());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chainsys.setName(resultSet.getString("admin_name"));
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to get the Admin Name");
		}
		return chainsys.getName();
	}

	public String adminGetEmail(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql2 = "select email from admin where username=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql2);
			preparedStatement.setString(1, chainsys.getAdminUsername());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chainsys.setEmail(resultSet.getString("email"));
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to get the Admin Email");
		}
		return chainsys.getEmail();
	}

	public ArrayList<Chainsys> employeeList(Chainsys chainsys) {
		ArrayList<Chainsys> clist = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select employee_id,employee_name,position,username,phone_number,email,date_of_birth from chainsys";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			clist = new ArrayList<>();

			while (resultSet.next()) {
				Chainsys chainsys2 = new Chainsys();
				chainsys2.setEmployeeId(Integer.parseInt(resultSet
						.getString("employee_id")));
				chainsys2.setName(resultSet.getString("employee_name"));
				chainsys2.setPosition(resultSet.getString("position"));
				chainsys2.setUsername(resultSet.getString("username"));
				chainsys2.setPhonenumber(Long.parseLong(resultSet
						.getString("phone_number")));
				chainsys2.setEmail(resultSet.getString("email"));
				chainsys2.setDob((resultSet.getDate("date_of_birth")
						.toLocalDate()));
				clist.add(chainsys2);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call the Employee List ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call the Employee List ");
		}
		return clist;

	}

	public void setTimesheet(Chainsys chainsys) {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into timesheet (employee_id,ondate,task,timesheet_number)values(?,?,?,timesheet_timesheet_number_sq.nextval)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, chainsys.getEmployeeId());
			preparedStatement.setDate(2, Date.valueOf(chainsys.getOndate()));
			preparedStatement.setString(3, chainsys.getTask());
			preparedStatement.executeQuery();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to Call the setTimesheet");
		}
	}

	public ArrayList<Chainsys> adminViewTimesheet(Chainsys chainsys) {
		ArrayList<Chainsys> clist = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select employee_id,ondate,task,timesheet_number,taskstatus,timesheetstatus from timesheet";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			clist = new ArrayList<>();
			while (resultSet.next()) {
				Chainsys chainsys2 = new Chainsys();
				chainsys2.setEmployeeId(resultSet.getInt("employee_id"));
				chainsys2
						.setOndate((resultSet.getDate("ondate").toLocalDate()));
				chainsys2.setTask(resultSet.getString("task"));
				chainsys2.setTaskStatus(resultSet.getString("taskstatus"));
				chainsys2.setTimeSheetStatus(resultSet
						.getString("timesheetstatus"));
				chainsys2.setTimesheetNumber(resultSet
						.getInt("timesheet_number"));
				clist.add(chainsys2);
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clist;
	}

	public int deleteEmployee(Chainsys chainsys) {
		int rows = 0;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "update chainsys set username='--' where employee_id=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setInt(1, chainsys.getEmployeeId());
			rows = preparedStatement.executeUpdate();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;

	}

}
