package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.CustomerVo;

@Repository
public class CustomerDao {
	public List<CustomerVo> findAll() {
		return DBManager.selectAllCustomer();
	}
}
