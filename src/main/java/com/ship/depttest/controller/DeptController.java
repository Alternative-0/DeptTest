package com.ship.depttest.controller;

import com.ship.depttest.Service.DeptService;
import com.ship.depttest.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/all")
    public List<Dept> list(){
        return deptService.queryAll();
    }

    @PostMapping("/dept/add/{dname}{db_source}")
    public boolean add(@PathVariable("dname") String dname,@PathVariable("db_source") String db_source,Dept dept){

        return deptService.addDept(dept);
    }

}
