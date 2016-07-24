package com.hometask11.junit;

import com.hometask.module11.module9.cesarcode.EnglishCesar;
import org.junit.Assert;
import org.junit.Test;

public class EnglishCesarTest {

    private final int key = 3;

    @Test
    public void encryptTest() {
        final String stringTest = "Keep calm and love coding";
        final EnglishCesar englishCesar = new EnglishCesar(stringTest, key);
        final String result = englishCesar.toEncrypt();
        final String expect = "Nhhs fdop dqg oryh frglqj";
        Assert.assertEquals(expect, result);
    }
    @Test
    public void decryptTest(){
        final String stringTest = "Nhhs fdop dqg oryh frglqj";
        final EnglishCesar englishCesar = new EnglishCesar(stringTest, key);
        final String result = englishCesar.toDecrypt();
        final String expect = "Keep  and love coding";
        Assert.assertEquals(expect, result);
    }

}



