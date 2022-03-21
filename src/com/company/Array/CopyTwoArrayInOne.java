package com.company.Array;

import java.util.Arrays;

public class CopyTwoArrayInOne {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] array2 = {40,50,60};

        // create new array
        int [] newArray =new int[array1.length + array2.length]; // size of the array is sum of size of two array

        //copying the values of first array to new array
        for (int i = 0; i < array1.length ; i++) {
            newArray[i] = array1[i];
        }
        //copying the values of second array to new array
        for (int i = 0, j=array1.length; j<(array1.length + array2.length); j++, i++) {
            newArray[j] = array2[i];
        }
        //print array elements
        System.out.println("copy and print  array elements");
        for (Integer arrayPrint: newArray ) {
            System.out.print(" " +arrayPrint);
        }


        // array which should be merged
        String[] src1 = {"Java", "Python", "C++"};
        String[] src2 = {"HTML", "CSS", "JavaScript"};

        // create new array
        String[] newArray2 = new String[src1.length + src2.length];

        // Copy first to new array from 0 to src1.length
        System.arraycopy(src1, 0, newArray2, 0, src1.length);

        // copy second array to new array
        System.arraycopy(src2, 0, newArray2, src1.length, src2.length);

        // display all array
        System.out.println("");
        System.out.println("using arraycopy method");
        System.out.println("Array1 = " + Arrays.toString(src1));
        System.out.println("Array2 = " + Arrays.toString(src2));
        System.out.println("Merged Array = "
                + Arrays.toString(newArray2));

    }
}
