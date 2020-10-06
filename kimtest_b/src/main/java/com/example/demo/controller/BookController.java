package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.BookDao;

@Controller
public class BookController {
	
	@Autowired
	private BookDao dao;
	
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}


	@RequestMapping("/listBook.do")
	public void listBook(Model model) {
		model.addAttribute("list", dao.findAll());
	}
}
