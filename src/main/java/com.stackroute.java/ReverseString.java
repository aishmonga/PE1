package com.stackroute.java;

public class ReverseString {

    public String RevString(String input){
        String[] strArr = input.split("");

        String[] reverse =new String[strArr.length] ;
        int j=0;

        for(int i =strArr.length-1  ; i >=0 ; i--){

            reverse[j] = strArr[i];
            j++;
        }

        String FinalStr = String.join("",reverse);

    return FinalStr;

    }



}
