package com.codecool.dynamicArrayDojo;

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

    }

    public void insert(int insertPos, int nubmer) {

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
