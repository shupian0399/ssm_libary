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

public interface EmployeeService {

    public Employee getEmpl(Integer id);

}
