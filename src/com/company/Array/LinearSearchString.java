package com.company.Array;


public class LinearSearchString {
    public static void main(String[] args) {

        String stringData = new String("sudheesh" );// string data
        char [] temp = stringData.toCharArray(); // convert  to  character array
        int count =0; // set count

        // loop for character select
        for (int i = 0; i<stringData.length()-1;i++){
            //loop  for count repeat
            for (char repeat: temp) {
                if (repeat == stringData.charAt(i)){
                    count ++;
                }
            }
            System.out.println(stringData.charAt(i)+" repeated " + count + " times ");
            count =0;//reset  count
        }
    }
}
