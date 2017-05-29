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
        char[] characters = s.toCharArray();
        //check if password is different from "password"
        String p = "password";
        if (!s.equalsIgnoreCase(p)) {
            result++;
        }
        //check if password is of sufficient length
        if (s.length() >= 8 && !s.contains(" ")){
            result++;
        }
        //check if special character is in password
        boolean specialChar = false;
        for (int i=0; i<characters.length; i++){
            if (!Character.isDigit(characters[i]) || !Character.isLetter(characters[i])){
                specialChar = true;
            }
        }
        if (specialChar == true){
            result++;
        }
        //check if password contains number
        if (s.contains("0") || s.contains("1") || s.contains("2")
                || s.contains("3") || s.contains("4") || s.contains("5")
                || s.contains("6") || s.contains("7") || s.contains("8")
                || s.contains("9")){
            result++;
        }
        //check if there are different cases in password
        boolean upper = false;
        boolean lower = false;
        for (int i=0; i<characters.length; i++) {
            if (Character.isUpperCase(characters[i]) == true) {
                upper = true;
            }
            else if (Character.isLowerCase(characters[i]) == true) {
                lower = true;
            }
        }
        if (upper == true && lower == true) {
            result++;
        }
        return result;
    }
}
