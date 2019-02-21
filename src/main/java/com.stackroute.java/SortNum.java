package com.stackroute.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortNum {

    public Boolean SortFunc(String input) {

        int sum = 0;

        String[] strArr = input.split("");

        Arrays.sort(strArr, Collections.reverseOrder());

        String.join("",strArr);

        for(String s :strArr){
           if( (Integer.parseInt(s))% 2 == 0) {
               sum += Integer.parseInt(s);
           }
        }
               System.out.println(sum);

               if(sum>15){
                    return true ;
               }
               else {
                   return false;
               }
   }

}
