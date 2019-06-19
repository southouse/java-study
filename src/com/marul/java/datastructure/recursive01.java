package com.marul.java.datastructure;

import java.util.Scanner;

/**
 * @author iffybot
 * Factorial
 */
public class recursive01 {

    static int factorial(int n) {
        if (n > 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        System.out.println("정수 " + x + "! = " + factorial(x));
    }

}
