package SampleProblems;

import java.util.Scanner;

    /*
        * Problem Description
            Take an integer A as input, you have to tell whether it is a prime number or not.
            A prime number is a natural number greater than 1 which is divisible only by 1 and itself.

        * Problem Constraints
            1 <= A <= 106

        * Input Format
            First and only line of the input contains a single integer A.

        * Output Format
            Print YES if A is a prime, else print NO.
    */

public class IsItPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int count = 0;
        for(int i = 2; i * i <= A; i++){
            if(A % i == 0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
