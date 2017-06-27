package com.miss.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.miss.dao.TestDao;
import com.miss.domain.TestPOJO;

@Service
public class TestServices {
	@Resource
	private TestDao testDao;

	public String show() {
		return "hello world!";
	}

	public List<TestPOJO> showDao(int age) {
		return testDao.get(age);
	}
}
