package com.ajiteshmadai;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {


            int[] indices = null;

            // Time Complexity = O(n^2)
            // Space Complexity = O(1)
            /*for (int i = 0; i < nums.length ; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        indices =   new int[2]
                        indices[0] = i;
                        indices[1] = j;
                        return indices;
                    }
                }
            }
            return indices;

        */
            // Time Complexity = O(n)
            // Space Complexity = O(n)
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numberdiff = target - nums[i];
            if (numbers.containsKey(numberdiff)) {
                indices = new int[2];
                indices[0] = numbers.get(numberdiff);
                indices[1] = i;
            } else {
                numbers.put(nums[i], i);
            }
        }
        return indices;

            // Time Complexity : O(log n) + O(n) = O(nlogn)
            // Space Complexity : O(n)
            /*int[] sortedArr = Arrays.stream(nums).sorted().toArray();
            int leftPointer = 0;
            int rightPointer = nums.length - 1;
            for(int i = 0; i<nums.length; i++) {
                int sum = nums[leftPointer] + nums[rightPointer];
                if(sum == target) {
                    indices = new int[2];
                    indices[0] = leftPointer;
                    indices[1] = rightPointer;
                    return indices;
                } else if(sum < target) {
                    leftPointer++;
                } else if(sum > target) {
                    rightPointer--;
                }
            }

          return  indices;*/



    }
}
