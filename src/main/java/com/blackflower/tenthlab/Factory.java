package com.blackflower.tenthlab;

public class Factory {
    Employee[] employees = new Employee[5];
    
    void HireNewEmp(Employee emp){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = emp;
                return;
            }
        }
    }
    
    int TotalSalary(String titleVal){
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].title == titleVal) {
                total += employees[i].salary;
            }
        }
        return total;
    }
    
    void IncreaseSalary(int id){
        for (Employee emp : employees) {
            if (emp != null && emp.id == id) {
                emp.salary += 5000;
            }
        }
    }
    
    void IncreaseSalaryByGiven(int minSalary){
        for (Employee emp : employees) {
            if (emp.salary < minSalary) {
                emp.salary += 5000;
            }
        }
    }
}
