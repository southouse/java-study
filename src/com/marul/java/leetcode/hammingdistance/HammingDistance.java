package com.marul.java.leetcode.hammingdistance;

/**
 * @author iffybot
 */
public class HammingDistance {
    public int hammingDistance(){
        int x = 11;
        int y = 4;
        int count = 0; // = Hamming Distance

        int[] a = toBinary(x);
        int[] b = toBinary(y);

        for (int i=0; i<a.length; i++) {
            if (a[i] != b[i])
                count++;
        }

        return count;
    }

    private static int[] toBinary(int num) {
        int index = 0;
        int[] array = new int[32];
        while(num != 0) {
            array[index++] = num % 2;
            num /= 2;
        }
        return array;
    }
}
