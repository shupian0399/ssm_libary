package com.apan.libary.service;

import com.apan.libary.bean.Employee;
import com.apan.libary.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:啊潘
 *
 * @date 2021/8/23
 */
@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    public Employee getEmpl(Integer id) {
        return employeeMapper.getEmpl(id);
    }
}
