package com.training.database;

import java.util.List;

import com.training.org.EmployeeDTO;

public interface StudentDAO {
	 public void create(Integer id, String name, Integer age);
	  public List<Student> listStudents();
}
