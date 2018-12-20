package com.stackroute.unittest.PE1;

import java.util.Scanner;

public class RandomGuess {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int target=35;
        do {

            System.out.println("Enter no between 1-50");
            n = scanner.nextInt();
            System.out.println(randomguess(n,target));
        }while(n!=target);


    }



    public static String randomguess(int n,int target)
    {

        if (n<target)
        {
            return "Number guessed is less than the target";
        }

        else if(n==target)
        {
            return "Number matches the target";
        }
        else{
            return "Number is greater than the target";
        }

    }
}
