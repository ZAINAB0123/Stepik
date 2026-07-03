package com.taskflow.app;


import java.util.Collections;

public class Main {

	public static void main(String[] args){
Employee employee1 = new Employee(2,"Ivan", 34);
Employee employee3 = new Employee(3,"Petar", 30);
Employee employee2 = new Employee(1,"Irina", 37);
Employee emp = new Employee();
emp.addEmp(employee1);
emp.addEmp(employee2);
emp.addEmp(employee3);
System.out.println(emp.getList());
        System.out.println("sort");
        Collections.sort(emp.getList());
        System.out.println(emp.getList());
	}


}
