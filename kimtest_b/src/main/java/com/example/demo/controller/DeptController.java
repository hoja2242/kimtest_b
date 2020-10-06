package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DeptDao;



@Controller
public class DeptController {
	@Autowired
	private DeptDao dao;
	public void setDao(DeptDao dao) {
		this.dao = dao;
	}
	@RequestMapping("/listDept.do")
	public void list(Model model) {
		model.addAttribute("list", dao.findAll());
	}
}
