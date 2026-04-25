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
        int result = 0;

        for (int num : a) {
            result ^= num;
        }

        return result;
    }
}
