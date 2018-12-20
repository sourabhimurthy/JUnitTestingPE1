package com.stackroute.unittest.PE1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopPatternTest {

    @Test
    public void patternLoop() {
            LoopPattern p = new LoopPattern();
            assertEquals("122", p.patternLoop(2));
        }

    @Test
    public void patternLoop1() {
        LoopPattern p = new LoopPattern();
        assertEquals("122333", p.patternLoop(3));
    }

    }
