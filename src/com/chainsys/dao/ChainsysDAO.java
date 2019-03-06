package com.chainsys.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.RequestDispatcher;

import com.chainsys.model.Chainsys;
import com.chainsys.util.ConnectionUtil;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ChainsysDAO {

	public Boolean login(Chainsys chainsys) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select username,password from chainsys where username=? and password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
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
		ConnectionUtil.close(connection, preparedStatement, null);
		return chainsys.isFlag();

	}

	public void get(Chainsys chainsys) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql2 = "select employee_id,employee_name,email from chainsys where username=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql2);
		preparedStatement.setString(1, chainsys.getUsername2());
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Chainsys.setId(resultSet.getInt("employee_id"));
			Chainsys.setEmpname(resultSet.getString("employee_name"));
			Chainsys.setEmail2(resultSet.getString("email"));
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
	}

	public void register(Chainsys chainsys) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "insert into chainsys (employee_id,employee_name,username,password,phone_number,position,email,date_of_birth) values(chainsys_employee_id_seq43.nextval,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, chainsys.getName());
		preparedStatement.setString(2, chainsys.getUsername());
		preparedStatement.setString(3, chainsys.getPassword());
		preparedStatement.setLong(4, chainsys.getPhonenumber());
		preparedStatement.setString(5, chainsys.getPosition());
		preparedStatement.setString(6, chainsys.getEmail());
		preparedStatement.setDate(7, Date.valueOf(chainsys.getDob()));
		preparedStatement.executeQuery();
		ConnectionUtil.close(connection, preparedStatement, null);
	}

	public ArrayList<Chainsys> attendance(Chainsys chainsys)
			throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "SELECT ondate,employee_id,employee_name,present_hours,status,reason,approval FROM attendance WHERE employee_id=? and ondate BETWEEN ? AND ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, chainsys.getId());
		preparedStatement.setDate(2, Date.valueOf(chainsys.getFromDate()));
		preparedStatement.setDate(3, Date.valueOf(chainsys.getTodate()));

		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Chainsys> clist = new ArrayList<>();
		while (resultSet.next()) {
			Chainsys chainsys2 = new Chainsys();
			chainsys2.setOndate((resultSet.getDate("ondate").toLocalDate()));
			chainsys2.setEmployeeId(resultSet.getInt("employee_id"));
			chainsys2.setName(resultSet.getString("employee_name"));
			chainsys2.setPresentHours(resultSet.getString("present_hours"));
			chainsys2.setStatus(resultSet.getString("status"));
			chainsys2.setReason(resultSet.getString("reason"));
			chainsys2.setApproval(resultSet.getString("approval"));
			clist.add(chainsys2);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return clist;
	}

	public ArrayList<Chainsys> viewTimeSheet(Chainsys chainsys)
			throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select ondate,task,taskstatus,timesheetstatus from timesheet where employee_id=? and ondate between ? and ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, chainsys.getId());
		preparedStatement.setDate(2, Date.valueOf(chainsys.getFromDate()));
		preparedStatement.setDate(3, Date.valueOf(chainsys.getTodate()));

		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Chainsys> clist = new ArrayList<>();
		while (resultSet.next()) {
			Chainsys chainsys2 = new Chainsys();
			chainsys2.setOndate((resultSet.getDate("ondate").toLocalDate()));
			chainsys2.setTask(resultSet.getString("task"));
			chainsys2.setTaskStatus(resultSet.getString("taskstatus"));
			chainsys2
					.setTimeSheetStatus(resultSet.getString("timesheetstatus"));
			clist.add(chainsys2);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return clist;
	}

	public void timeSheets(Chainsys chainsys) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "update timesheet set Taskstatus=? where employee_id=? and ondate=? and timesheet_number=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, chainsys.getTaskStatus());
		preparedStatement.setInt(2, chainsys.getId());
		preparedStatement.setDate(3, Date.valueOf(chainsys.getOndate2()));
		preparedStatement.setInt(4, chainsys.getTimesheetNumber());
		preparedStatement.executeQuery();
		ConnectionUtil.close(connection, preparedStatement, null);
	}

	public ArrayList<Chainsys> ondateTimeSheet(Chainsys chainsys)
			throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select ondate,task,taskstatus,timesheetstatus,timesheet_number from timesheet where employee_id=? and ondate=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, chainsys.getId());
		preparedStatement.setDate(2, Date.valueOf(chainsys.getOndate2()));

		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Chainsys> clist = new ArrayList<>();
		while (resultSet.next()) {
			Chainsys chainsys2 = new Chainsys();
			chainsys2.setOndate((resultSet.getDate("ondate").toLocalDate()));
			chainsys2.setTask(resultSet.getString("task"));
			chainsys2.setTaskStatus(resultSet.getString("taskstatus"));
			chainsys2
					.setTimeSheetStatus(resultSet.getString("timesheetstatus"));
			chainsys2.setTimesheetNumber(resultSet.getInt("timesheet_number"));
			clist.add(chainsys2);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return clist;
	}

	public ArrayList<Chainsys> viewProfile(Chainsys chainsys)
			throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select employee_name,position,username,password,phone_number,email from chainsys where employee_id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, chainsys.getId());

		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Chainsys> clist = new ArrayList<>();
		while (resultSet.next()) {
			Chainsys chainsys2 = new Chainsys();

			chainsys2.setName(resultSet.getString("employee_name"));
			chainsys2.setEmployeeId(chainsys.getId());
			chainsys2.setPosition(resultSet.getString("position"));
			chainsys2.setUsername(resultSet.getString("username"));
			chainsys2.setPassword(resultSet.getString("password"));
			chainsys2.setPhonenumber(resultSet.getLong("phone_number"));
			chainsys2.setEmail(resultSet.getString("email"));

			clist.add(chainsys2);
		}
		ConnectionUtil.close(connection, preparedStatement, resultSet);
		return clist;
	}

	public void updateProfile(Chainsys chainsys) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "update chainsys set employee_name=?,username=?,password=?,phone_number=? where employee_id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, chainsys.getName());
		preparedStatement.setString(2, chainsys.getUsername());
		preparedStatement.setString(3, chainsys.getPassword());
		preparedStatement.setLong(4, chainsys.getPhonenumber());
		preparedStatement.setInt(5, chainsys.getId());
		preparedStatement.executeQuery();
		ConnectionUtil.close(connection, preparedStatement, null);

	}

	public void forgetPassword(Chainsys chainsys) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "update chainsys set password=? where employee_id=? and employee_name=? and position=? and username=? and phone_number=? and email=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, chainsys.getPassword());
		preparedStatement.setInt(2, chainsys.getEmployeeId());
		preparedStatement.setString(3, chainsys.getName());
		preparedStatement.setString(4, chainsys.getPosition());
		preparedStatement.setString(5, chainsys.getUsername());
		preparedStatement.setLong(6, chainsys.getPhonenumber());
		preparedStatement.setString(7, chainsys.getEmail());
		preparedStatement.executeQuery();
		ConnectionUtil.close(connection, preparedStatement, null);
	}

}
