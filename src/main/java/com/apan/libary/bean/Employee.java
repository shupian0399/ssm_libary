package com.apan.libary.bean;

import lombok.Data;

/**
 * author:啊潘
 *
 * @date 2021/8/3
 */
@Data
public class Employee {
    private Integer id;
    private String lastname;
    private String email;
    private String gender;

    public Employee() {
    }

    public Employee(Integer id, String lastname, String email, String gender) {
        this.id = id;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=null" +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
