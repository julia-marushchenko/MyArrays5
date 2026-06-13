/**
 *  Java program to reverse an array.
 */

package com.myarrays;

import java.util.Arrays;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating the array with 11 elements.
        int[] intArray = new int[11];

        // Creating helping value with starting index.
        int index = 0;

        // Adding elements from 1 to 11 to the array.
        for (int i = 1; i < 12l; i++) {

            // Assigning a value to element of array with index.
            intArray[index] = i;

            // Incrementing the index.
            index++;

        }

        // Printing the original array.
        System.out.println(Arrays.toString(intArray));

        // Reversing the intArray.
        int[] reversedArray = new int[intArray.length];

        // Changing index to 0.
        index = 0;

        // Adding elements to the reversedArray.
        for (int i = intArray.length - 1; i > -1 ; i--) {

            // Assigning a value to element of reversedArray with index i.
            reversedArray[i] = intArray[index];

            // Incrementing the index.
            index++;
        }

        // Printing the new array to console.
        System.out.println(Arrays.toString(reversedArray));
    }
}
