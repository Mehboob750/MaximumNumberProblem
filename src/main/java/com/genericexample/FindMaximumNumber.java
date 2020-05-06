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

    public String maximumValue(String value1, String value2, String value3) {
    if (value1.length()>value2.length() && value1.length()> value2.length())
        return value1;
    else if (value2.length()>value1.length() && value2.length()> value3.length())
        return value2;
    else
        return value3;
    }
}
