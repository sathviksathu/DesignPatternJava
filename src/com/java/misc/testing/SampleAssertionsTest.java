package com.java.misc.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleAssertionsTest {

    @Test
    public void testAssertArrayEquals(){
        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();
        assertArrayEquals(expected,actual,"Failure - byte arrays not same");
    }

    @Test
    public void testAssertEquals(){
        assertEquals("text","text","failure - strings are not equal");
        //checks that two primitive/objects are equal
    }

    @Test
    public void testAssertFalse(){
        assertFalse(false,"failure: should be false");
        //checks that a condition is false
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object(),"Shouldn't be null");
        //checks that an object is not null
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(),new Object(),"should not be same object");
        //checks if both objects are different
    }

    @Test
    public void testAssertNull(){
        assertNull(null, "should be null");
        //checks if the object is null
    }
}
