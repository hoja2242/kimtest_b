package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.DeptVo;

@Repository
public class DeptDao {
	public List<DeptVo> findAll() {
		return DBManager.selectAllDept();
	}
}
