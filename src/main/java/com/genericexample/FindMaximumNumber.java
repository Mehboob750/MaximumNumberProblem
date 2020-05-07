package com.genericexample;

import java.util.Arrays;

public class FindMaximumNumber<E extends Comparable<E>> {

    public E maximumValue(E... values) {
        Arrays.sort(values);
        int maximumValueIndex=values.length-1;
        return values[maximumValueIndex];
    }

}
