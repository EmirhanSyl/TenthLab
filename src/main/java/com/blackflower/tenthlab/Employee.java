package com.blackflower.tenthlab;

public class Employee {

    int id;
    String name;
    String lastName;
    String title;

    int salary;

    int[] bonusPayment = new int[3];

    boolean HasBonusPayment() {
        int totalPayment = 0;
        for (int i = 0; i < bonusPayment.length; i++) {
            totalPayment += bonusPayment[i];
        }
        
        return (totalPayment > 0);
    }
}
