package com.timbuchalka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int myIntValue = 10;
        int anoherIntValue = myIntValue;
        System.out.println("myIntValue =" + myIntValue);
        System.out.println("anotherIntValue =" + anoherIntValue);

        anoherIntValue++;

        System.out.println("myIntValue =" + myIntValue);
        System.out.println("anotherIntValue =" + anoherIntValue);

        int[] myIntArray = new int[5]; // [0,0,0,0,0]
        int[] anotherArray = myIntArray; // [0,0,0,0,0]

        //myIntArray is pointing to the object in memory i.e. the ARRAY
        //anotherArray is pointing to the same object in memory
        //both are addresses

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
    }
}
