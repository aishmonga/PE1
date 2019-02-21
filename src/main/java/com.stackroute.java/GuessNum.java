package com.stackroute.java;

public class GuessNum {

    public String GuessFunc(int input){

        int originalNum = 20;

        if (input > originalNum){
            return ("input is more than originalNum");
        }else if(input < originalNum){
            return ("input is less than originalNum");
        }
        else {
            return ("input matches the originalNum");
        }

    }

}
