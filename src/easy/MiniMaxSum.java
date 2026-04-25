/**
 * Problem: Mini-Max Sum
 * Link: https://www.hackerrank.com/challenges/mini-max-sum/problem
 *
 * Description:
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */

package easy;

import java.util.*;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;

        int min = arr.get(0);
        int max = arr.get(0);

        for (int num : arr) {
            total += num;

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }
}