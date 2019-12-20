package com.spring4.SpingJDBC.Entity;

/**
 * @Classname Employee
 * @Description TODO
 * @Date 2019-12-19 21:02
 * @Created by Justin
 */
public class Employee {
    Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    String name;

    String email;

    Integer age;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
