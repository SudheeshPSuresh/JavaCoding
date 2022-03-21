package com.company.Array;

public class StringReversal {
    public static void main(String[] args) {

        String data = new String("sudheesh"); // string data
        char [] rev = data.toCharArray(); // convert to character array
        char [] temp = new char[rev.length]; // set temp
        for (int i = 0; i < data.length() ; i++) {
            temp[data.length()-1-i] = rev[i];
        }
        System.out.println("string reversal with out using inbuilt methods");
        System.out.println(data);
        data = String.valueOf(temp);
        System.out.println(data);
    }
}

