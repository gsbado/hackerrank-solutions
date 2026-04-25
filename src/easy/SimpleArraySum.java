/**
 * Problem: Simple Array Sum
 * Link: https://www.hackerrank.com/challenges/simple-array-sum/problem
 *
 * Description:
 * Given an array of integers, find the sum of its elements.
 */

package easy;

import java.util.*;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        List<Integer> numbers = ar;
        int numbersSum = 0;

        for (int i=0; i < numbers.size(); i++) {
            numbersSum += numbers.get(i);
        }

        return numbersSum;
    }
}
