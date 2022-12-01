package com.blackflower.tenthlab;

public class TenthLab {

    public static void main(String[] args) {
        int[][] table = {
            {3, 5, 8},
            {8, 6},
            {5, 8, 90},
            {5, 8}
        };
        
        int total = 0;
        int count = 0;
        for (int i = 1; i < table.length; i+=2) {
            for (int j = 1; j < table[i].length; j+=2) {
                total += table[i][j];
                count++;
            }
        }
        System.out.println(total / count);
        
        int[] maxMean= MaxMean(table);
        for (int i = 0; i < maxMean.length; i++) {
            System.out.println(maxMean[i]);
        }

    }
    
    static int[] MaxMean(int [][] mDA){
        int maxMean = 0;
        int maxMeanIndex = 0;
        for (int i = 0; i < mDA.length; i++) {
            int mean = 0;
            for (int j = 1; j < mDA[i].length; j++) {
                mean += mDA[i][j];
            }
            mean /= mDA[i].length;
            
            if (maxMean < mean) {
                maxMean = mean;
                maxMeanIndex = i;
            }
        }
        return mDA[maxMeanIndex];
    }
}
