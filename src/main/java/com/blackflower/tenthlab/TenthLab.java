package com.blackflower.tenthlab;

public class TenthLab {

    public static void main(String[] args) {
         Factory factory = new Factory();
         
         Employee emp = new Employee();
         emp.id = 1254;
         emp.name = "Emirhan";
         emp.lastName = "Soylu";
         emp.title = "C";
         emp.salary = 5;
         
         factory.HireNewEmp(emp);
         factory.HireNewEmp(emp);
         
         System.out.println(factory.employees[1].name);
    }

}
