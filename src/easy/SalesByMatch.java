/**
 * Problem: Sales by Match
 * Link: https://www.hackerrank.com/challenges/sock-merchant/problem
 *
 * Description:
 * There is a large pile of socks that must be paired by color.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 */

package easy;

import java.util.*;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        int pairCount = 0;

        Collections.sort(ar);

        int currentIndex = 0;

        while (currentIndex < n - 1) {
            int currentColor = ar.get(currentIndex);
            int nextColor = ar.get(currentIndex + 1);

            if (currentColor == nextColor) {
                pairCount++;
                currentIndex += 2;
            } else {
                currentIndex++;
            }
        }
        return pairCount;
    }
}
