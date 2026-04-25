/**
 * Problem: Lonely Integer
 * Link: https://www.hackerrank.com/challenges/lonely-integer/problem
 *
 * Description:
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 */

package easy;

import java.util.*;

public class LonelyInteger {
    public static int resultlonelyinteger(List<Integer> a) {
        List<Integer> numbers = a;
        int result = 0;

        for (int currentNumber : numbers) {
            result ^= currentNumber;
        }

        return result;
    }
}
