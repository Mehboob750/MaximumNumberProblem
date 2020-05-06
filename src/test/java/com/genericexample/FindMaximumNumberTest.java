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
}
