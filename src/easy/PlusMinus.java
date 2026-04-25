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
    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) {
                positive ++;
            } else if (num < 0) {
                negative ++;
            } else {
                zero++;
            }
        }
        int n = arr.size();

        System.out.printf("%.6f\n", (double) positive / n);
        System.out.printf("%.6f\n", (double) negative / n);
        System.out.printf("%.6f\n", (double) zero / n);
    }
}