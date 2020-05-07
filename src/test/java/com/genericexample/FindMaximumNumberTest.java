package com.genericexample;

import org.junit.Assert;
import org.junit.Test;
import java.util.Optional;

public class FindMaximumNumberTest {
    @Test
    public void givenIntegerValues_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        int maxNumber = (int)findMaximumNumber.maximumValue(30,10,20,5,15);
        Assert.assertEquals(30,maxNumber);
    }
    @Test
    public void givenIntegerValues_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        int maxNumber = (int)findMaximumNumber.maximumValue(10,30,20,5,15);
        Assert.assertEquals(30,maxNumber);
    }
    @Test
    public void givenIntegerValues_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        int maxNumber = (int)findMaximumNumber.maximumValue(10,5,30,20,15);
        Assert.assertEquals(30,maxNumber);
    }

    @Test
    public void givenFloatValues_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Float maxNumber = (Float) findMaximumNumber.maximumValue(30.30f,5.5f,15.15f,10.10f,20.20f);
        Assert.assertEquals(java.util.Optional.of((Float)30.30f),java.util.Optional.of(maxNumber));
    }
    @Test
    public void givenFloatValues_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Float maxNumber = (Float) findMaximumNumber.maximumValue(10.10f,30.30f,15.15f,5.5f,20.20f);
        Assert.assertEquals(java.util.Optional.of((Float)30.30f),java.util.Optional.of(maxNumber));
    }
    @Test
    public void givenFloatValues_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Float maxNumber = (Float) findMaximumNumber.maximumValue(10.10f,20.20f,30.30f,15.15f,10.10f);
        Assert.assertEquals(java.util.Optional.of((Float)30.30f),java.util.Optional.of(maxNumber));
    }

    @Test
    public void givenStringValues_MaxValueAT_FirstPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        String maxValue = (String) findMaximumNumber.maximumValue("Peach","Apple","Banana","Mango");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenStringValues_MaxValueAT_SecondPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        String maxValue = (String) findMaximumNumber.maximumValue("Apple","Peach","Banana","Mango");
        Assert.assertEquals("Peach",maxValue);
    }
    @Test
    public void givenStringValues_MaxValueAT_ThirdPosition_ShouldReturnSame() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        String maxValue = (String) findMaximumNumber.maximumValue("Apple","Banana","Peach","Mango");
        Assert.assertEquals("Peach",maxValue);
    }
}
