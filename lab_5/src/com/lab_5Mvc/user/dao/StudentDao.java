package com.lab_5Mvc.user.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lab_5Mvc.user.domain.Student;
import com.lab_5Mvc.user.domain.User;
import com.lab_5Mvc.util.DatabaseConnection;

public class StudentDao {
	public Student saveMark(String name, String id,String chinese,String math,String english) {
		Connection conn = DatabaseConnection.getConnection();
		String sql = "INSERT INTO student(name,id,chinese,math,english) VALUES ('" + name
				+ "','" +id+"','"+ chinese + "','"+math+"','"+english+"')";
		try {
			Statement stm = conn.createStatement();
			stm.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
