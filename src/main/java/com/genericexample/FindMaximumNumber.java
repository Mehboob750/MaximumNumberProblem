package com.genericexample;

import java.util.Arrays;

public class FindMaximumNumber<E extends Comparable<E>> {

    public E maximumValue(E... values) {
        Arrays.sort(values);
        int maximumValueIndex=values.length-1;
        FindMaximumNumber.printMaximumValue(values[maximumValueIndex]);
        return values[maximumValueIndex];
    }

    private static <E extends Comparable<E>> void printMaximumValue(E value) {
        System.out.println("Maximum Value is: "+value);
    }

}
