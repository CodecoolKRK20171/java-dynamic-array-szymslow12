package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

// put your code here!
public class DynamicIntArray {

    int[] numberArray;

    public DynamicIntArray() {
        numberArray = new int[0];
    }

    public DynamicIntArray(int initialSize) {
        numberArray = new int[initialSize];
    }

    public void add(int number) {
        if (numberArray.length == 0) {
            numberArray = new int[1];
            numberArray[0] = number;
        } else {
            int[] newNumberArray = new int[numberArray.length + 1];
            System.arraycopy(numberArray, 0, newNumberArray, 0, numberArray.length);
            newNumberArray[numberArray.length] = number;
            numberArray = newNumberArray;
        }
    }


    public void remove(int number) {
        int index = findNumberIndex(number);
        int[] newNumberArray = new int[numberArray.length - 1];
        if (index == 0) {
            System.arraycopy(numberArray, 1, newNumberArray, 0, numberArray.length - 1);
            numberArray = newNumberArray;
        } else {
            System.arraycopy(numberArray, 0, newNumberArray, 0, index);
            System.arraycopy(numberArray, index + 1, newNumberArray, index, numberArray.length - (index + 1));
            numberArray = newNumberArray;

        }
    }

    private int findNumberIndex(int number) {
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void insert(int insertPos, int number) {

    }

    public String toString() {
        StringBuilder sB = new StringBuilder(" ");
        for (int i = 0; i < numberArray.length; i++) {
            if (i != numberArray.length - 1) {
                sB.append(String.format("%s ", numberArray[i]));
            } else {
                sB.append(numberArray[i]);
            }
        }
        return sB.toString();
    }
}
