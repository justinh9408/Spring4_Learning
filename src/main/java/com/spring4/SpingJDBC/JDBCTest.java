package com.spring4.SpingJDBC;

import com.spring4.SpingJDBC.Entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname JDBCTest
 * @Description TODO
 * @Date 2019-12-19 20:20
 * @Created by Justin
 */
public class JDBCTest {

    ApplicationContext ctx = null;
    JdbcTemplate jdbcTemplate = null;

    {
        ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext-JDBC.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    }

    @Test
    public void testQueryForList(){
        String sql = "SELECT id, name, email, age FROM Employee WHERE id > ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        List<Employee> employees = jdbcTemplate.query(sql,rowMapper, 1);
        System.out.println(employees);

    }

    @Test
    public void testQueryObject(){
        String sql = "SELECT id, name, email, age FROM Employee WHERE id = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql,rowMapper, 1);
        System.out.println(employee);
    }

    @Test
    public void testInsert(){
        String sql = "INSERT INTO employee(name,email) VALUES(?,?)";
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"Jiecong", 2});
        args.add(new Object[]{"Huang", 12});

        jdbcTemplate.batchUpdate(sql,args);
    }

    @Test
    public void testUpdate(){
        String sql = "UPDATE employee set email = ? where id = ?";
        jdbcTemplate.update(sql,"aa@gmail.com", 1);
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }

}
