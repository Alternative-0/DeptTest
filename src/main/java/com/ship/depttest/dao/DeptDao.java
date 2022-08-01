package com.ship.depttest.dao;

import com.ship.depttest.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface DeptDao {
    public List<Dept> queryAll();
    public Dept queryById(@Param("deptno") Long id);
    public boolean addDept(Dept dept);
}
