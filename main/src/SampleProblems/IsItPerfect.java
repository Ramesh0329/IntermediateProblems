package SampleProblems;

import java.util.Scanner;

    /*
        * Problem Description
            Take T (number of test cases) as input.
            For each test case, take integer N as input, you have to tell whether it is a perfect number or not.
            A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).
            A positive proper divisor divides a number without leaving any remainder.

        * Problem Constraints
            1 <= T <= 10
            1 <= N <= 106

        * Input Format
            The first line of the input contains a single integer T.
            Each of the next T lines contains a single integer N.

        * Output Format
            In a separate line, print YES if a given integer is perfect, else print NO.
    */

public class IsItPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int sum = 0;
            for(int j = 1; j < N; j++){
                if(N % j == 0){
                    sum = sum + j;
                }
            }
            if(sum == N){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
