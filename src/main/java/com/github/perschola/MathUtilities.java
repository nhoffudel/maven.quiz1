package com.github.perschola;

import java.util.stream.LongStream;

public class MathUtilities {

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number) {
        if (number == 0) return 1;
        Integer ans = number;
        for (int i = number - 1; i > 0; i--) ans *= i;
        return ans;
    }

    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd number
     * @return the sum of the two numbers
     */
    public Integer add(Integer baseValue, Integer valueToAdd) {
        return baseValue + valueToAdd;
    }

    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd second number
     * @return the sum of the two numbers
     */
    public Double add(Double baseValue, Double valueToAdd) {
        return baseValue + valueToAdd;
    }

    /**
     * Get half the value of the number
     *
     * @param number the number given
     * @return the half of the number in double
     */
    public Double half(Integer number) {
        return (double) number / 2;
    }

    /**
     * Determine if the number is odd
     *
     * @param number the number given
     * @return true if the number is odd, false if it is even
     */
    public Boolean isOdd(Integer number) {
        if (number % 2 == 0) return true;
        return false;
    }


    /**
     * Multiply the number by itself
     *
     * @param number the number given
     * @return the result of the number multiply by itself
     */
    public Integer square(Integer number) {
        return number * number;
    }

}
