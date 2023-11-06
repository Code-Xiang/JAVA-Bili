package com.kuang.dao;

import com.kuang.pojo.Department;
import com.kuang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @description：TODO
 * @author： xiangxuewei
 * @create： 2023/11/5 21:52
 */
// 员工Dao
@Repository
public class EmployeeDao {
    // 模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;
    // 员工所属部门
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<Integer, Employee>(); // 创建一个部门表
        employees.put(101,new Employee(1001,"教学部","932027769@qq.com",1,new Department(101,"研发部")));
        employees.put(102,new Employee(1002,"市场部","932027769@qq.com",1,new Department(101,"研发部")));
        employees.put(103,new Employee(1003,"教研部","932027769@qq.com",1,new Department(101,"研发部")));
        employees.put(104,new Employee(1004,"运营部","932027769@qq.com",1,new Department(101,"研发部")));
        employees.put(105,new Employee(1005,"后勤部","932027769@qq.com",1,new Department(101,"研发部")));
    }
   // 主键自增
    private static Integer initId = 1006;
   // 增加一个员工
    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    // 查询全部员工信息
    public Collection<Employee> getAll(){
        return employees.values();
    }
    // 通过Id查询员工
    public  Employee getEmployeeById(Integer id){
        return  employees.get(id);
    }
    // 删除员工
    public void delete(Integer id){
        employees.remove(id);
    }
}
