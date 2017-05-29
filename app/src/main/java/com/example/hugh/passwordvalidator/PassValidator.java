package com.example.hugh.passwordvalidator;

/**
 * Created by Hugh on 2017-05-28.
 */

public class PassValidator {
    //constructor
    public PassValidator(){
    }
    //validator method used for testing
    public int validate(String s){
        int result = 0;
        String p = "password";
        if (!s.equalsIgnoreCase(p)) {
            result++;
        }
        if (s.length() >= 8 && !s.contains(" ")){
            result++;
        }
        return result;
    }
}
