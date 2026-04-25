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
        List<Integer> numbers = arr;
        long totalSum = 0;

        int smallestValue = numbers.get(0);
        int largestValue = numbers.get(0);

        for (int currentNumber : numbers) {
            totalSum += currentNumber;

            if (currentNumber < smallestValue) {
                smallestValue = currentNumber;
            }

            if (currentNumber > largestValue) {
                largestValue = currentNumber;
            }
        }

        long minimumSum = totalSum - largestValue;
        long maximumSum = totalSum - smallestValue;

        System.out.println(minimumSum + " " + maximumSum);
    }
}