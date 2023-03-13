package SampleProblems;

import java.util.Scanner;

    /*
        * Problem Description
            Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

        * Problem Constraints
            1 <= N <= 1000

        * Input Format
            A single line representing N

        * Output Format
            A single integer showing sum of all Natural numbers from 1 to N
    */

public class SummationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N * (N + 1)/2;
        System.out.println(sum);
    }
}
