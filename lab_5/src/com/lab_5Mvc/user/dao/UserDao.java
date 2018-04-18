package com.lab_5Mvc.user.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lab_5Mvc.user.domain.User;
import com.lab_5Mvc.util.DatabaseConnection;

public class UserDao {
	public User checkLogin(String userName, String password) {
		Connection conn = DatabaseConnection.getConnection();
		String sql = "select * from t_user where userName='" + userName
				+ "' and password= '" + password + "'";
		try {
			Statement stm = conn.createStatement();
			ResultSet set = stm.executeQuery(sql);
			while (set.next()) {
				String userName1 = set.getString("userName");
				String password1 = set.getString("password");
				User user = new User();
				user.setUserName(userName1);
				user.setPassword(password1);
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
