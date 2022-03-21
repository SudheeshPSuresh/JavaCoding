package com.company.Array;

import java.util.Arrays;

public class ArrayProgram {
    public static void main(String[] args) {


        //array  declaration and memory allocation
        int [] age = new int[2]; // array name is "age" and integer datatype with  2 memory allocation

        //array declaration
        String [] name = new String[3]; // this array can store only 3 values

        //Array index started from  0,  and if size of an array =n , then the last  element of the array will be at index of n-1,
        //So in this case size of array is 2, then the last index is 1.

        //array initialization using index
        age[0] = 10; // value of 10  add to  0 index
        age[1] = 20; // value of 20  add to  1 index

        //second method - in initialize and declare an array in single line
        int [] age2 = {10,20,30}; // array name is "age" and integer datatype with  2 memory allocation, the values 10,20,30

        /* we can read array value from two option
            1. index based
            2. on looping
        */

        System.out.println("index based array value ");

        //index based access
        System.out.println(age[0]); // read value of index 0
        System.out.println(age[1]); // read value of index 1


        //looping
        System.out.println("looping based array value ");
        for (int i = 0; i < age.length; i++) { // array.length ---- is the function to determine the array length
            System.out.println(age2[i]); // pass i value for looping .. so the value of i changes 1 ,2 . after reach i value equal to 2 loop stop execution
        }


        //Multidimensional Array
        //declare multidimensional arrays.
        double[][] matrix = {{1.2, 4.3, 4.0},
                {4.1, -1.1}
        };
        System.out.println("Multidimensional Arrays ");
        for (double[] matrix1: matrix) {
            Arrays.stream(matrix1).forEach(System.out::println); // lambda expression
        }
    }
}
