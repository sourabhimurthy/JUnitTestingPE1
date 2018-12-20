package com.stackroute.unittest.PE1;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String inp = sc.next();
        int len = inp.length();
        String st = vowels_consonants(inp, len);
        if (st == "2") {
            System.out.println("Not valid");
        } else {
            int i = 0;
            while (i != st.length()) {
                if (st.charAt(i) == '1') {
                    System.out.println("Vowel");
                    i++;
                } else {
                    System.out.println("Consonants");
                    i++;
                }
            }

        }
    }
    public static String vowels_consonants(String inp,int len)
    {
        int i=0;
        String res="";
        while(i!=len)
        {

            if(inp.charAt(i)>=48 && inp.charAt(i)<=57)
            {
                res= "2";
                break;
            }
           else if(inp.charAt(i)=='a'||inp.charAt(i)=='e'||inp.charAt(i)=='i'||inp.charAt(i)=='o'||inp.charAt(i)=='u')
            {
                res+=1;
                i++;
            }

            else if(inp.charAt(i)=='A'||inp.charAt(i)=='E'||inp.charAt(i)=='I'||inp.charAt(i)=='O'||inp.charAt(i)=='U')
            {
                res+=1;
                i++;
            }
           else{
               res+=0;
               i++;
            }


        }
        return res;
    }
}
