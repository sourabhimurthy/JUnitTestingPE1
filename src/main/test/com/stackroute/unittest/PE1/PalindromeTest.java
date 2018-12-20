package com.stackroute.unittest.PE1;

import main.java.com.stackroute.unittest.PE1.Palindrome;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
@Test
    public void palindrome()
{
    Palindrome obj=new Palindrome();
    assertEquals(true,obj.palindrome("12321"));
    assertEquals(false,obj.palindrome("123211"));
}

@Test
    public void check()
{
    Palindrome p1=new Palindrome();
    assertEquals(0,p1.check("12321"));
    assertEquals(1,p1.check("93648284639"));
}


}