package com.stackroute.java;

public class VowelConsonant {

    public String vowelCons( String str ){


        char[] charactersInStr = str.toCharArray();


        String  s = "";


        for (char ch: charactersInStr) {

            if (( ch == 'a') || ( ch == 'e' ) || ( ch == 'i' ) || ( ch == 'o' ) || ( ch == 'u' )){

                if (s == "") {
                    s = s+"Vowel";
                } else {
                    s += " Vowel";
                }

            }
            else{
                if (s == "") {
                    s = s+"Consonant";
                } else {
                    s += " Consonant";
                }

            }

        }

        return s;

    }

}
