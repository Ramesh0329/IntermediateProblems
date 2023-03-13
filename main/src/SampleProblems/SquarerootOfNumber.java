package SampleProblems;

import java.util.Scanner;

    /*
        * Problem Description
            Given a number A. Return square root of the number if it is perfect square otherwise return -1.
        * Problem Constraints
            1 <= A <= 108
        * Input Format
            First and the only argument is an integer A.
        * Output Format
            Return an integer which is the square root of A if A is perfect square otherwise return -1.
    */

public class SquarerootOfNumber {
    public static int solve(int A) {
        if(A == 0 || A == 1){
            return A;
        }
        int S = 1;
        int E = A;

        while(S <= E){
            long mid = (S + E)/2;
            if(mid * mid == A){
                return (int)mid;
            }
            if(mid * mid <= A){
                S = (int)mid + 1;
            }else{
                E = (int)mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int X = solve(A);
        System.out.print(X);
    }
}
