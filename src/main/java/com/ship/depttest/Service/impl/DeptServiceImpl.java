package com.ship.depttest.Service.impl;

import com.ship.depttest.Service.DeptService;
import com.ship.depttest.dao.DeptDao;
import com.ship.depttest.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
}
