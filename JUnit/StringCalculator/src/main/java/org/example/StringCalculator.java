package org.example;

public class StringCalculator {
    public static int add(String input){
        String[] arr;
        if(input.equals("")){
            return 0;
        }
        arr = input.split(",");
        if(arr.length==1){
            return Integer.parseInt(arr[0]);
        }
        return Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
    }

}
