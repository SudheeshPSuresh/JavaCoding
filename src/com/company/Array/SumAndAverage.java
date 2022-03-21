package com.company.Array;

import java.util.Arrays;
import java.util.List;

public class SumAndAverage {

    public static void main(String[] args) {


        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12}; // Integer array with 10 values

        int sum = 0; // declare a variable with value 0
        double average; // declare a variable


        //1. method

        //for loop
        for (int i = 0; i < numbers.length; i++) {
            sum= sum+numbers[i];
        }
        int arrayLength =  numbers.length; //  declare a variable arrayLength and store array size
        average = (double) sum / (double) arrayLength; // calculating the average, sum and array length value are integer data type so this will cast to double

        System.out.println("array sum and average by using for loop");
        System.out.println("sum of the array : "+sum);
        System.out.println("average of array : "+average);



        //2. method

        int sum1 = 0; // declare a variable with value 0
        double average1; // declare a variable

        //access all values of an array using for each looping and calculate the sum and store to variable sum , number is the object
        for (Integer number: numbers) {
            sum1+=number;// sum = sum+number
        }
        // calculating average of array elements
        average1 = (double) sum1 / (double) arrayLength; // calculating the average, sum and array length value are integer data type so this will cast to double

        System.out.println("array sum and average by using foreach loop");
        System.out.println("sum of the array : "+sum1);
        System.out.println("average of array : "+average1);


    }
}
