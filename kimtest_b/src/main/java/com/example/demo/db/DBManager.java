package com.example.demo.db;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.CustomerVo;
import com.example.demo.vo.DeptVo;

public class DBManager {
	static SqlSessionFactory sqlSessionFactory;
	static {
		try {
		String resource = "com/example/demo/db/sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<DeptVo> selectAllDept() {
		SqlSession session = sqlSessionFactory.openSession();
		List<DeptVo> list = session.selectList("dept.selectAll");
		session.close();
		return list;
	}
	public static List<CustomerVo> selectAllCustomer() {
		SqlSession session = sqlSessionFactory.openSession();
		List<CustomerVo> list = session.selectList("customer.selectAll");
		session.close();
		return list;
	}
}
