/**
 * Problem: Plus Minus
 * Link: https://www.hackerrank.com/challenges/plus-minus/problem
 *
 * Description:
 * Given an array of integers, calculate the ratios of its elements that are positive, negative and zero.
 * Print the decimal value of each fraction on a new line with 6 places after the decimal.
 */

package easy;

import java.util.*;

public class PlusMinus {
    public static void plusMinus(List<Integer> numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int currentNumber : numbers) {
            if (currentNumber > 0) {
                positiveCount++;
            } else if (currentNumber < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        int totalElements = numbers.size();

        System.out.printf("%.6f\n", (double) positiveCount / totalElements);
        System.out.printf("%.6f\n", (double) negativeCount / totalElements);
        System.out.printf("%.6f\n", (double) zeroCount / totalElements);
    }
}