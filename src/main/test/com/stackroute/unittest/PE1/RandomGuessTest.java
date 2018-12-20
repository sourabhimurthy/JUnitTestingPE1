package com.stackroute.unittest.PE1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomGuessTest {
    @Before


    @Test
    public void randomguess() {
        RandomGuess r1=new RandomGuess();
        assertEquals("Number guessed is less than the target",r1.randomguess(22,35));

    }

    @Test
    public void randomguess1() {
        RandomGuess r2=new RandomGuess();
        assertEquals("Number is greater than the target",r2.randomguess(40,35));

    }

    @Test
    public void randomguess3() {
        RandomGuess r3=new RandomGuess();
        assertEquals("Number matches the target",r3.randomguess(35,35));

    }
}