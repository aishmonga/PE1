package com.stackroute.java;

import org.hamcrest.core.SubstringMatcher;

public class RepeatChars {

    public String repeatFunc(String initialStr, int num) {

        String result = initialStr;

        String trimmedString = initialStr.substring(initialStr.length() - num );

        for (int r = 1; r <= num; r++) {
            result += trimmedString;
        }

        return result;

    }

}
