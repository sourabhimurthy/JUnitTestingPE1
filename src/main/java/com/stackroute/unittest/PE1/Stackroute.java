package com.stackroute.unittest.PE1;

import java.util.Scanner;

public class Stackroute {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.print(str);
        String s1=repeatString(str,n);
        System.out.println(s1);

    }
    public static String repeatString(String str,int num)
    {  String st="";

        for(int i=1;i<=num;i++)
        {
            for(int j=str.length()-num;j<=str.length()-1;j++)
            {
                st+=str.charAt(j);
            }
        }
        return st;
    }
}
