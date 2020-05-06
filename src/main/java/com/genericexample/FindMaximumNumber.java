package com.genericexample;

public class FindMaximumNumber<E extends Comparable<E>> {
    E firstValue,secondValue,thirdValue;

    public FindMaximumNumber(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public E maximumValue() {
        E maximum = maximumValue(firstValue,secondValue,thirdValue);
        return maximum;
    }

    public static <E extends Comparable> E maximumValue(E firstValue,E secondValue,E thirdValue) {
        E maximum=firstValue;
        if (secondValue.compareTo(maximum)>0)
            maximum=secondValue;
        if(thirdValue.compareTo(maximum)>0)
            maximum=thirdValue;
        return maximum;
    }

}
