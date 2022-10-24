package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "CodeUp";

        //Assert.assertEquals(expected, actual);
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testArrayEquality(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testStrings(){
        String language = "PHP";

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}