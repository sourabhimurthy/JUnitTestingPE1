package com.stackroute.unittest.PE1;


import java.util.Scanner;

public class Palindrome1 {
    static int[] a = new int[20];
    public static void main(String[] args) {
        // write your code here
        Scanner sn = new Scanner(System.in);
        int originalNumber = sn.nextInt();
        Palindrome1 p = new Palindrome1();
        boolean b1=p.checkPalindrome(originalNumber);
        boolean b2=p.isGreaterThan25(originalNumber);
        //System.out.println(b1);
    }
    public boolean checkPalindrome(int num) {
        int n = num;
        int rem = 0;
        int rev = 0;
        int i = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            a[i++] = rem;
            n = n / 10;
        }
        if (rev == num) {
            return true;        }
        return false;
    }
    public boolean isGreaterThan25 (int num) {
        int sum = 0;
        int n = num;
        int rem = 0;
        int rev = 0;
        int i = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            a[i++] = rem;
            n = n / 10;
        }
        if (rev == num) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] % 2 == 0) {
                    sum = sum + a[j];
                }
            }
        }
        if(sum>25)
            return true;
        return false;
    }
}

