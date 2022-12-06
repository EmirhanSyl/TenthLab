package com.blackflower.tenthlab;

import java.util.ArrayList;
import java.util.Arrays;

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
         
         //System.out.println(factory.employees[1].name);
         
         int[] numbers = {1, 2, 5, 8, 7, 9, 11, 10, 1, 1, 1};
         System.out.println(maxOddLimit(numbers, 6));
         System.out.println(FindNumberOfElements(numbers, 1));
         
         System.out.println(Arrays.deepToString(FindIterationCountsOfElements(numbers)));
         
    }
    
    
    static int maxOddLimit(int[] numbers, int limit){
        int result = Integer.MAX_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > limit && numbers[i] % 2 == 1) {
                if (numbers[i] < result) {
                    result = numbers[i];
                }
            }
        }        
        return result;
    }
    
    static int FindNumberOfElements(int[] numbers, int element){
        int elementCount = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (element == numbers[i]) {
                elementCount++;
            }
        }
        
        return elementCount;
    }
    
    static int[][] FindIterationCountsOfElements(int[] numbers){
        int[][] result = new int[numbers.length][2];
        
        for (int i = 0; i < numbers.length; i++) {
            int controlNum = numbers[i];
            int elementCount = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && controlNum == numbers[j]) {
                    elementCount++;
                }
            }
            result[i][0] = numbers[i];
            result[i][1] = elementCount;
        }
        
        return result;
    }

}
