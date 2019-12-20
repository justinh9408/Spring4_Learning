package com.spring4.SpingJDBC.Repository;

import com.spring4.SpingJDBC.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @Classname EmployeeDao
 * @Description TODO
 * @Date 2019-12-19 21:43
 * @Created by Justin
 */
@Repository
public class EmployeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Employee getEmployee(int id){
        String sql = "SELECT id, name, email, age FROM Employee WHERE id = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql,rowMapper, 1);
        return employee;
    }
}
