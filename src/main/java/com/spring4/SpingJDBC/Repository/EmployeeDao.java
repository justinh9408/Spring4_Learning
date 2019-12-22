package com.spring4.SpingJDBC.Repository;

import com.spring4.SpingJDBC.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @Classname EmployeeDao
 * @Description TODO
 * @Date 2019-12-19 21:43
 * @Created by Justin
 */
@Repository
public class EmployeeDao {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Employee getEmployee(int id){
        String sql = "SELECT id, name, email, age FROM Employee WHERE id = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql,rowMapper, 1);
        return employee;
    }
}
