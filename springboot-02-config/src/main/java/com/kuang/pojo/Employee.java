package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description：TODO
 * @author： xiangxuewei
 * @create： 2023/11/5 20:24
 */
//员工表
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender; // 0:女 1:男
    private Department department;
    private Date date;
    // 默认日期创建

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.date = new Date();
    }
}
