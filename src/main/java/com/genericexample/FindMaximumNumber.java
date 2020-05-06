package com.genericexample;

public class FindMaximumNumber {

    public int maximumValue(int number1, int number2, int number3) {
        if (number1>number2 && number1>number3)
            return number1;
        else if (number2>number1 && number2>number3)
            return number2;
        else
            return number3;
    }

    public Float maximumValue(float number1, float number2, float number3) {
        if (number1>number2 && number1>number3)
            return number1;
        else if (number2>number1 && number2>number3)
            return number2;
        else
            return number3;
    }
}
