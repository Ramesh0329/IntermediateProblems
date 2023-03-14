package SampleProblems;

import java.util.Scanner;

    /*
        * Problem Description
            You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
            If sum of cubes of each digit of the number is equal to the number itself,
            then the number is called an Armstrong number.
            For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
            Note: All the test cases in this problem are limited to 3 digit numbers.

        * Problem Constraints
            1 <= N <= 500

        * Input Format
            First and only line of input contains an integer N.

        * Output Format
            Output all the Armstrong numbers in range [1,N] each in a new line.
    */

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int temp = n;
        for(int i = 1; i <= n; i++){
            boolean isArmstrong = false;
            int sum = 0;
            int j = i;
            while(j > 0){
                int lastDigit = j % 10;
                sum = sum + (lastDigit * lastDigit * lastDigit);
                j = j/10;
            }
            if(sum == i){
                isArmstrong = true;
            }
            if(isArmstrong == true){
                System.out.println(i);
            }
        }
    }
}
