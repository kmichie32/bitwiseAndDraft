package com.company;

import java.io.*;
import java.util.*;

public class Solution {
    public int additionFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number + additionFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        int numberforSet = scanner.nextInt();

        int[] setHolder = new int[numberforSet];
        for(int i = 0; i < setHolder.length; i++){
            setHolder[i]= i+1;
        }


        int sizeOfArrayFinal = solution.additionFactorial(numberforSet-1);


        int[] valueHolder = new int[sizeOfArrayFinal];
        int q = 0;
        for(int i = 0; i < setHolder.length; i++){
            for(int j = i+1; j < setHolder.length;j++) {
                if (j > i) {
                    valueHolder[q] = (setHolder[i] & setHolder[j]);
                    q++;
                }
            }
        }

        for(int i = 0; i < valueHolder.length; i++){
            System.out.println(valueHolder[i]);
        }




        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}