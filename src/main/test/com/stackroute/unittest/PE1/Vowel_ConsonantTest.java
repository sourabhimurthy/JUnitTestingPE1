package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Vowel_ConsonantTest {


    @Test
    public void vowels_consonants() {
        Vowel_Consonant v1=new Vowel_Consonant();
        assertEquals("1010",v1.vowels_consonants("AcEF",4));
        assertEquals("1011",v1.vowels_consonants("ASEI",4));
        assertEquals("2",v1.vowels_consonants("123",3));
    }
}