package com.company.Array;

public class LargestNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 50, -2 , 200, 5, 32};

        int largest = numbers[0]; // local variable

        // looping
        for (int temp: numbers) {
            if( temp > largest ){
                largest = temp;
            }
        }

        System.out.println( largest );
    }
}
