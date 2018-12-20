package com.stackroute.unittest.PE1;
import java.util.ArrayList;
import java.util.Scanner;

public class LoopPattern {

    public String patternLoop(int num) {
        int k=0;
        String str="";
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                str = str + Integer.toString(i);
            }
        }
        return str;
    }
    }

