package com.ship.depttest.Service;

import com.ship.depttest.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeptService {

    public List<Dept> queryAll();
    public Dept queryById(Long id);
    public boolean addDept(Dept dept);

}
