package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @description：TODO
 * @author： xiangxuewei
 * @create： 2023/11/5 20:10
 */
// 部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Department {
    private Integer id;
    private String department;

}
