package cn.fcsca.springbootmybatis.controller;

import cn.fcsca.springbootmybatis.bean.Department;
import cn.fcsca.springbootmybatis.bean.Employee;
import cn.fcsca.springbootmybatis.mapper.DepartmentMapper;
import cn.fcsca.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * DepartmentController
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 15:38 2018-08-14
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }
}
