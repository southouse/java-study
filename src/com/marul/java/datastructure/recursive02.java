package com.marul.java.datastructure;

import java.util.Scanner;

/**
 * @author iffybot
 * 최대공약수
 */

public class recursive02 {

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : "); int a = stdIn.nextInt();
        System.out.print("정수를 입력하세요 : "); int b = stdIn.nextInt();

        System.out.println("두 정수 " + a + "와 " + b + "의 최대공약수는 " + gcd(a, b, 2) + "입니다.");
        System.out.println("두 정수 " + a + "와 " + b + "의 최대공약수(유클리드)는 " + euclidGCD(a, b) + "입니다.");
    }

    static int gcd(int a, int b, int c) {
        if (a == b)
            return a;
        else if((a%c!=0 || b%c!=0) && Math.max(a, b) >= c)
            return gcd(a, b, c+1);
        else if(a%c==0 && b%c==0)
            return c * gcd(a / c, b / c, 2);
        else
            return 1;
    }

    static int euclidGCD(int x, int y) {
        if (y == 0)
            return x;
        else
            return euclidGCD(y, x%y);
    }
}
