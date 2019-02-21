package com.stackroute.java;

public class ConditionCheckTJ {

    public String TomJerry(int tj){

        if ( tj >20 && tj<30 ){

            if ( tj % 2 != 0 ){

                return ("Tom");

            }
            else{

                return ("Jerry");

            }

        }

        return ("! TomJerry");

    }

}
