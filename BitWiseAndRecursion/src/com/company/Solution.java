package com.company;

import java.io.*;
import java.util.*;

public class Solution {
    public int additionFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number + additionFactorial(additionFactorial(number - 1));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int numberforSet = scanner.nextInt();
        int sizeOfArrayBeforeAdjustment = scanner.nextInt();
        int sizeOfArrayFinal = solution.additionFactorial(sizeOfArrayBeforeAdjustment);



        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}