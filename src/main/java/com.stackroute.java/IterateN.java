package com.stackroute.java;

public class IterateN {
    public String Seriesfunc(int n){

        String result = "";

        for(int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
//                result += i;

                if (result.equals("")){
                    result += i ;
                }
                else{
                    result = result+" "+i;
                }


            }
        }

        return result;
    }
}
