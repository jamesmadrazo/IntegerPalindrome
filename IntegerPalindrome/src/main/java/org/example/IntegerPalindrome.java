package org.example;

public class IntegerPalindrome {

        public boolean checkPalindrome(Integer input) {

            String str = input.toString(); //convert input to string to perform check

            for (int i = 0; i < (str.length() / 2); i++) { //only need to check first half against second half of input to be certain

                if (str.charAt(i) != (str.charAt(str.length() - 1 - i))) { //compare input[i] to input[length-i-1]

                    return false; //if the input is not a palindrome, exit loop immediately and return false

                }

            }

            return true;

        }

    }
