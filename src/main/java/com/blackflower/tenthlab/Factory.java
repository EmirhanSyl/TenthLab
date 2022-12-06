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
    
    void IncreaseSalary(int id, int increaseAmount){
        for (Employee emp : employees) {
            if (emp != null && emp.id == id) {
                emp.salary += increaseAmount;
            }
        }
    }
    
    void IncreaseSalaryByGiven(int minSalary, int increaseAmount){
        for (Employee emp : employees) {
            if (emp != null && emp.salary < minSalary) {
                emp.salary += increaseAmount;
            }
        }
    }
    
    void EmployeesWithNoPayment(){
        for(Employee employee : employees){
            if(employee != null){
                int totalPayment = 0;
                for (int i = 0; i < employee.bonusPayment.length; i++) {
                    totalPayment += employee.bonusPayment[i];
                }
                
                if (totalPayment == 0) {
                    System.out.println(employee.name);
                }
            }
        }
        
    }
}
