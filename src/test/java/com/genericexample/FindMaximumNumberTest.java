package com.genericexample;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberTest {
    @Test
    public void givenThreeInteger_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(30,10,20);
        int maxNumber = (int)findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.firstValue,maxNumber);
    }
    @Test
    public void givenThreeInteger_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(10,30,20);
        int maxNumber = (int)findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.secondValue,maxNumber);
    }
    @Test
    public void givenThreeInteger_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(10,20,30);
        int maxNumber = (int)findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.thirdValue,maxNumber);
    }

    @Test
    public void givenThreeFloat_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(30.30f,10.10f,20.20f);
        Float maxNumber = (Float) findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.firstValue,maxNumber);
    }
    @Test
    public void givenThreeFloat_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(10.10f,30.30f,20.20f);
        Float maxNumber = (Float) findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.secondValue,maxNumber);
    }
    @Test
    public void givenThreeFloat_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(10.10f,20.20f,30.30f);
        Float maxNumber = (Float) findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.thirdValue,maxNumber);
    }

    @Test
    public void givenThreeString_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber("Peach","Apple","Banana");
        String maxValue = (String) findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.firstValue,maxValue);
    }
    @Test
    public void givenThreeString_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber("Apple","Peach","Banana");
        String maxValue = (String) findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.secondValue,maxValue);
    }
    @Test
    public void givenThreeString_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber("Apple","Banana","Peach");
        String maxValue = (String) findMaximumNumber.maximumValue();
        Assert.assertEquals(findMaximumNumber.thirdValue,maxValue);
    }
}
