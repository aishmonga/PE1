package com.stackroute.java;

import java.util.Arrays;

public class AddInt {

    public int addfunc(String str){

        int addOfArr = 0;

        String[] StrMembArr = str.split("\\s+" );

        for ( String  s :  StrMembArr ){
            addOfArr += Integer.parseInt(s);
        }




        return addOfArr;
    }

}

