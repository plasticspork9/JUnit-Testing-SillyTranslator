package org.pursuit.testing_revisited_creating_tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.pursuit.testing_revisited_creating_tests.translator.SillyTranslator;

public class SillyTranslatorUnitTest {

    // TODO: add setup method

    @Test
    public void checkDoubleTalk() {
        //Given
        String testString = "pursuit";
        String expectedResult = "Pursuit pursuit";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void checkDoubleTalk_WithNullInput(){
        //Given
        String testString = null;
        String expectedResult = "";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDoubleTalk_WithNumberInput(){
        //Given
        String testString = "1234";
        String expectedResult = "1234 1234";

        //When
        String result = SillyTranslator.getInstance().doubleTalk(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeak() {
        //Given
        String testString = "samer";
        String expectedResult = "ssss" + testString.toLowerCase();

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkSnakeSpeak_IfUppercase() {
        //Given
        String testString = "Samer";
        String expectedResult = testString;

        //When
        String result = SillyTranslator.getInstance().snakeSpeak(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher(){
        //Given
        String testString = "samer";
        String expectedResult = "tbnfs";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithCapital(){
        //Given
        String testString = "Samer";
        String expectedResult = "Tbnfs";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithNumbers(){
        //Given
        String testString = "1234";
        String expectedResult = "2345";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithNumsAndLetters(){
        //Given
        String testString = "s1a2m3e4r";
        String expectedResult = "t2b3n4f5s";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void checkCaesarCypher_WithLastLetters(){
        //Given
        String testString = "xyz";
        String expectedResult = "yz{";

        //When
        String result = SillyTranslator.getInstance().caesarCypher(testString);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void SillyTranslator_testGetInstance(){
        SillyTranslator result = SillyTranslator.getInstance();
        SillyTranslator result2 = SillyTranslator.getInstance();

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SillyTranslator);
        Assert.assertEquals(result, result2);
        Assert.assertSame(result, result2);
    }
    // TODO: add tear down method

}
