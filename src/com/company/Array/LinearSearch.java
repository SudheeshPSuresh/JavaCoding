package com.company.Array;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = { 50, 90, 30, 70, 30 };
        Integer data = 30; // declare a variable with value 30
        boolean flag = false; // flag for setting if the value hit
        int repeatNumber = 0; // variable for get  number of repeat
        for (Integer search: arr) {
            if (search == data){
                repeatNumber++;
                flag =true;
            }
        }
        if (flag){
            System.out.println(data+ " data is found "+ repeatNumber+ " number times");
        }else {
            System.out.println("data not found");
        }
    }
}
