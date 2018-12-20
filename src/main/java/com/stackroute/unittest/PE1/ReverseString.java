package com.stackroute.unittest.PE1;

import java.util.Scanner;

public class ReverseString {
    public static  void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();

        String s1=Reversestring(str);
        System.out.println("Reversed string is "+s1);
    }

    public static String Reversestring(String str)
    {  int len=str.length()-1;
        String st=" ";
        for(int i=len;i>=0;i--){
            st=st+str.charAt(i);
        }
        return st;

    }
}
