package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	Write a program, which takes an integer N and if the number is less than 10
	then display "Thanks for helping Chef!" otherwise print "-1".

    Input
    The first line contains an integer T, total number of testcases.
    Then follow T lines, each line contains an integer N.

    Output
    For each test case, output the given string or -1 depending on conditions, in a new line.

    Constraints
    1 ≤ T ≤ 1000
   -20 ≤ N ≤ 20
    Example
    Input
    3
    1
    12
    -5
     Output
     Thanks for helping Chef!
     -1
     Thanks for helping Chef
	 */
Scanner sc = new Scanner(System.in);
int t,number;
t = sc.nextInt();
while(t-->0){
    number = sc.nextInt();
    if(number<10){
        System.out.println("Thanks for helping Chef!");
    }
    else{
        System.out.println("-1");
    }
}
    }
}
