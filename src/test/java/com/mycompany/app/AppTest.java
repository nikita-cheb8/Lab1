package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void findPopular1() {
        String result = App.findPopular("abc abide abode words abc abc");
        assertEquals(result, "abc");
    }

    @Test
    public void findPopular2() {
        String result = App.findPopular("abc");
        assertEquals (result, "abc");
    }

    @Test
    public void findPopular3() {
        String result = App.findPopular("      ");
        assertEquals(result, "");
    }

    @Test
    public void findPopular4() {
        String result = App.findPopular("abc cde ABC CDEf CDE cDE Cde");
        assertEquals(result, "cde");
    }

    @Test
    public void findPopular5() {
        String result = App.findPopular("abc cde ABC CDEf CDE");
        assertEquals(result, "There are 0 popular words");
    }

    @Test
    public void findPopular6() {
        String result = App.findPopular("");
        assertEquals(result, "");
    }

    @Test
    public void findPopular7() {
        String result = App.findPopular("::: _ _ _ : : : ; _ ;");
        assertEquals(result, "_");
    }

}
