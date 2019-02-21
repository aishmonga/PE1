package com.stackroute.java;
import java.util.Scanner;

public class palindromeCheck {

    public String pCheck(int a ){

        int rev = 0 , lastDigit , temp ,sum = 0  ;

        temp = a;

        while ( temp > 0 ){

            lastDigit = temp % 10 ;

            if(lastDigit % 2 == 0){

                sum += lastDigit;

            }

            rev = (rev * 10) + lastDigit ;

            temp = temp / 10 ;

        }

//        return String.valueOf(temp);

        if ( rev  == a ){

            if(sum > 25){

                return (rev + " is palindrome and the sum of even numbers is greater than 25");

            }
            else {

               return (rev + " is palindrome and the sum of even numbers is less than 25");
            }

        }

        else{

            return ("This is not palindrome");

        }


    }


}


