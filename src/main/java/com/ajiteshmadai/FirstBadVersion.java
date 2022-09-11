package com.ajiteshmadai;
/**
 * Leet Code Problem : <a href="https://leetcode.com/problems/first-bad-version/">https://leetcode.com/problems/first-bad-version/</a>
 * */
public class FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public class VersionControl {
        public boolean isBadVersion(int n) {
            return true;
        }
    }

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            return firstBadVersionBinarySearch(n);

        }

        /**
         * Linear Search
         * Time Complexity - O(n)
         * Space Complexity - O(1)
         * @param n
         * @return
         */
        public int firstBadVersionLinearSearch(int n) {

            int firstBadVersion = n;
            while(n > 0) {
                if(!isBadVersion(n)) {
                    break;
                }

                firstBadVersion = n;
                n--;

            }
            return firstBadVersion;
        }

        /**
         * Binary Search
         * Time Complexity - O(lonn)
         * Space Complexity - O(1)
         * @param n
         * @return
         */
        public int firstBadVersionBinarySearch(int n) {

            int firstBadVersion = n;
            int startIndex = 1;
            int endIndex = n-1;

            while(startIndex  <= endIndex) {
                int mid = startIndex + (endIndex - startIndex)/2;
                System.out.println("mid: " + mid);

                if(isBadVersion(mid)) {
                    endIndex = mid - 1;
                    firstBadVersion = mid;
                } else {
                    startIndex  = mid + 1;
                }

            }
            return firstBadVersion;
        }


    }
}
