package com.lcy.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.lcy.dao.EmployeeDao;
import com.lcy.entities.Employee;
import com.lcy.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class RestController {
	
	@Autowired
	private EmployeeDao employeeDao;


	
	@RequestMapping("/emps")
	public String list(Map<String,Object> map){

		map.put("employees",employeeDao.getAll());
		return "list";
	}
	
	
}
