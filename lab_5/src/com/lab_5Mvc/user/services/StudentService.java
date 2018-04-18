package com.lab_5Mvc.user.services;

import com.lab_5Mvc.user.dao.StudentDao;
import com.lab_5Mvc.user.dao.UserDao;
import com.lab_5Mvc.user.domain.Student;
import com.lab_5Mvc.user.domain.User;

public class StudentService {
	public Student saveMark(String name, String id,String chinese,String math,String english) {
		StudentDao studentDao = new StudentDao();
		return studentDao.saveMark(name, id, chinese, math, english);
	}
}
