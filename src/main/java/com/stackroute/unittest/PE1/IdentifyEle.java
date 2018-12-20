package com.stackroute.unittest.PE1;

import java.util.Scanner;

public class IdentifyEle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element");
        char c = sc.next().charAt(0);
        String res = identifyele(c);
        System.out.println(res);
    }
        public static String identifyele(char c)
        {
        if(c>='a' && c<='z')
        {
            return "Small letter";
        }
        else if(c>='A' && c<='Z')
        {
            return "Capital letter";
        }
        else if(c>=48 && c<=57){
            return "Number";

        }
        else{
            return "Special character";
        }
    }
}
