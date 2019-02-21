package com.stackroute.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingChar {

    public String MatchChar(char ch) {

//        String splChrs = "-/@#$%^&_+=()";
        Pattern pattern = Pattern.compile("[^a-z A-Z0-9]");
        Matcher matcher = pattern.matcher(String.valueOf(ch));


        boolean isCapitalChar = false;
        boolean isSmallChar = false;
        boolean isDigitChar = false;
        boolean isSpecialChar = false;


        if (Character.isUpperCase(ch)) {
            isCapitalChar = true;
            return "Capital Letter";
        } else if (Character.isLowerCase(ch)) {
            isSmallChar = true;
            return "Small Letter";
        } else if (Character.isDigit(ch)) {
            isDigitChar = true;
            return "A Digit";
        } else if (matcher.find()) {

            return "Special Symbol";
        }

        return null;
    }
}