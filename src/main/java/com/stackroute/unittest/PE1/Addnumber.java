package com.stackroute.unittest.PE1;

import java.util.Scanner;

public class Addnumber {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            String stringnum = scan.nextLine();
            Addnumber obj = new Addnumber();
            int sum = obj.sumOfNumber(stringnum);
            System.out.println("Sum is "+sum);
        }
        public int sumOfNumber(String stringnum)
        {
            String b[] = stringnum.split("\\s+");
            int sum = 0;
            for (String number : b)
            {
                Integer c = Integer.parseInt(number);
                sum = sum + c;
            }
            return sum;
        }
    }

