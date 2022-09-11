package com.ajiteshmadai;
/**
 * Leet Code Problem : <a href="https://leetcode.com/problems/search-insert-position/">https://leetcode.com/problems/search-insert-position/</a>
 */
public class SearchInsertPosition {

    class Solution {

        /*
        * Time Complexity : O(n)
        */
        public int searchInsert(int[] nums, int target) {
            int index = 0;
            int i = 0;
            while (i < nums.length) {
                if (nums[i] >= target) {
                    break;

                }
                i++;
                index = i;
            }

            return index;

        }
    }
}
