package org.example;

/*import static org.junit.Assert.assertTrue;

import org.junit.Test;*/

/**
 * Unit test for simple App.
 */
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;



class TestIntegerPalindrome {



    private IntegerPalindrome integerPalindromeChecker = new IntegerPalindrome();



    @Test

    public void TestThatValidEvenLengthPalindromeReturnsTrue() {

        Assertions.assertTrue(integerPalindromeChecker.checkPalindrome(7667));

    }



    @Test

    public void TestThatValidOddLengthPalindromeReturnsTrue() {

        Assertions.assertTrue(integerPalindromeChecker.checkPalindrome(75557));

    }



    @Test

    public void TestThatInvalidEvenLengthPalindromeReturnsFalse() {

        Assertions.assertFalse(integerPalindromeChecker.checkPalindrome(7100));

    }



    @Test

    public void TestThatInvalidOddLengthPalindromeReturnsFalse() {

        Assertions.assertFalse(integerPalindromeChecker.checkPalindrome(19081));

    }



    @Test

    public void TestThatSingleDigitNumberReturnsTrue() {

        Assertions.assertTrue(integerPalindromeChecker.checkPalindrome(9));

    }



    @Test

    public void TestThatNullNumberReturnsTrue() {

        Assertions.assertTrue(integerPalindromeChecker.checkPalindrome(null));

    }



    @Test

    public void TestMaxIntReturnsFalse() {

        Assertions.assertFalse(integerPalindromeChecker.checkPalindrome(Integer.MAX_VALUE));

    }



    @Test

    public void TestMaxIntValueReturnsFalse() {

        Assertions.assertFalse(integerPalindromeChecker.checkPalindrome(2147483647));

    }



    @Test

    public void TestMaxIntPlusOneHundredReturnsFalse() {

        Assertions.assertFalse(integerPalindromeChecker.checkPalindrome(Integer.MAX_VALUE + 100));

    }



    @Test

    public void TestLongPalindromeCastAsIntReturnsTrue() {

        Assertions.assertTrue(integerPalindromeChecker.checkPalindrome((int) 100000000000001L));

    }



    @Test

    public void TestNegativePalindromeReturnsTrue() {

        Assertions.assertTrue(integerPalindromeChecker.checkPalindrome(-6006));

    }



    @Test

    public void TestThatFloatCastAsIntValidPalindromeReturnsTrue() {

        Assertions.assertTrue(integerPalindromeChecker.checkPalindrome((int) 5000005F));

    }



    @Test

    public void TestThatFloatCastAsIntInvalidPalindromeReturnsFalse() {

        Assertions.assertFalse(integerPalindromeChecker.checkPalindrome((int) 2200001F));

    }



}