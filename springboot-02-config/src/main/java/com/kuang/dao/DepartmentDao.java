package com.kuang.dao;

import com.kuang.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @description：TODO
 * @author： xiangxuewei
 * @create： 2023/11/5 20:31
 */
// 部门dao
@Repository
public class DepartmentDao {
    // 模拟数据库中的数据
    private static Map<Integer, Department> department = null;
    static {
        department = new HashMap<Integer, Department>(); // 创建一个部门表
        department.put(101,new Department(101,"教学部"));
        department.put(102,new Department(102,"市场部"));
        department.put(103,new Department(103,"教研部 "));
        department.put(104,new Department(104,"运营部"));
        department.put(105,new Department(105,"后勤部 "));
    }
    // 获得所有部门信息
    public Collection<Department> getDepartments(){
        return department.values();
    }
    // 通过id得到部门
    public Department getDepartmentById(Integer id){
        return department.get(id);
    }
}
