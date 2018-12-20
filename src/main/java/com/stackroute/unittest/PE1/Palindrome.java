package main.java.com.stackroute.unittest.PE1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
            // write your code here
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the value");
            String inp = input.next();

            //String rev=inp.reverse();
            if (inp == null) {
                System.out.println(inp+" Not valid number");
            } else {
                boolean res = palindrome(inp);
                if(res)
                { System.out.println(inp +" is a palindrome");
                   int op= check(inp);
                   if(op==1)
                   {
                       System.out.println("Greater than 25");
                   }
                   else
                   {
                       System.out.println("Lesser than 25");
                   }
                }
                else{
                    System.out.println(inp+" Not a palindrome");
                }
            }
        }

        public static boolean palindrome(String inp)
        {   int count=0;
            int len=(inp.length());
            while(count!=inp.length()/2)
            {
                if(inp.charAt(count)==inp.charAt(len-1))
                {
                    count++;
                    len--;
                }
                else{
                    break;
                }
            }
            if(count==inp.length()/2)
                return true;
            else
                return false;
        }

        public static int check(String inp)
        {   int res=0;
            for(int i=0;i<inp.length();i=i+2)
            {
                res+=(int)(inp.charAt(i)-48);
            }
            if(res>25)
            {
               return 1;
            }
            else{
                return 0;
            }
        }
    }


