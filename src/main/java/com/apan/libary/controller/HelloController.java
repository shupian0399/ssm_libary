package com.apan.libary.controller;

import com.apan.libary.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author:啊潘
 *
 * @date 2021/8/23
 */
@Controller
public class HelloController {
   @Autowired
   private EmployeeService employeeService;
    @RequestMapping("/hello" )
    public String hello(Integer id)
    {
        System.out.println(employeeService.getEmpl(id));
        return "list";
    }
}
