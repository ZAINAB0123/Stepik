package com.taskflow.app;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {


    private long id;
    private String name;
    private int age;

    public  Employee(long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Employee(){

    }
    public String toString(){
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    private List<Employee> list = new ArrayList<Employee>();

    public List<Employee> getList() {
        return list;
    }

    public void addEmp(Employee employee){
        for(Employee e:list) {
            if (e.getId() == employee.getId()) {
                throw new IllegalStateException("List is id");
            }
        }
                list.add(employee);

    }
    @Override
    public int  compareTo(Employee emp) {
        return Long.compare(this.id,emp.getId());
    }
}
