package com.genericexample;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberTest {
    @Test
    public void givenThreeInteger_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        int maxNumber = findMaximumNumber.maximumValue(30,10,20);
        Assert.assertEquals(30,maxNumber);
    }
    @Test
    public void givenThreeInteger_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        int maxNumber = findMaximumNumber.maximumValue(10,30,20);
        Assert.assertEquals(30,maxNumber);
    }
    @Test
    public void givenThreeInteger_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        int maxNumber = findMaximumNumber.maximumValue(10,20,30);
        Assert.assertEquals(30,maxNumber);
    }

    @Test
    public void givenThreeFloat_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Float maxNumber = findMaximumNumber.maximumValue(30.30f,10.10f,20.20f);
        Assert.assertEquals(java.util.Optional.of((Float)30.30f),java.util.Optional.of(maxNumber));
    }
    @Test
    public void givenThreeFloat_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Float maxNumber = findMaximumNumber.maximumValue(10.10f,30.30f,20.20f);
        Assert.assertEquals(java.util.Optional.of((Float)30.30f),java.util.Optional.of(maxNumber));
    }
    @Test
    public void givenThreeFloat_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Float maxNumber = findMaximumNumber.maximumValue(10.10f,20.20f,30.30f);
        Assert.assertEquals(java.util.Optional.of((Float)30.30f),java.util.Optional.of(maxNumber));
    }

    @Test
    public void givenThreeString_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        String maxValue = findMaximumNumber.maximumValue("Banana","Peach","Apple");
        Assert.assertEquals("Banana",maxValue);
    }
    @Test
    public void givenThreeString_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        String maxValue = findMaximumNumber.maximumValue("Peach","Banana","Apple");
        Assert.assertEquals("Banana",maxValue);
    }
    @Test
    public void givenThreeString_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        String maxValue = findMaximumNumber.maximumValue("Peach","Apple","Banana");
        Assert.assertEquals("Banana",maxValue);
    }
}
