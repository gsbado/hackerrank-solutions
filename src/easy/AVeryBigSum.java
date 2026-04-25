/**
 * Problem: A Very Big Sum
 * Link: https://www.hackerrank.com/challenges/a-very-big-sum/problem
 *
 * Description:
 * In this challenge, you need to calculate and print the sum of elements in an array, considering that some integers may be very large.
 */

package easy;

import java.util.*;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        List<Long> numbers = ar;
        long longNumbersSum = 0;

        for (long number : numbers) {
            longNumbersSum += number;
        }

        return longNumbersSum;
    }
}
