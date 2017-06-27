package com.miss.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.miss.domain.TestPOJO;

@Mapper  //1
public interface TestDao {

    //根据age查找info
    List<TestPOJO> get(int age);

}
