package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void hashPassword() {
        Assert.assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        Assert.assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
        Assert.assertEquals("123", CodeupCrypt.hashPassword("123"));
        Assert.assertEquals("124", CodeupCrypt.hashPassword("12a"));
    }

    @Test
    public void checkPassword() {
        Assert.assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
        Assert.assertFalse("check password", CodeupCrypt.checkPassword("fer", "fer"));
    }

    @Test
    public void hasVersion(){
        Assert.assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        Assert.assertEquals(1.2, CodeupCrypt.version, 0);
    }
}