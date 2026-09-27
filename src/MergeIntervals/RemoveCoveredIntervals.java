package MergeIntervals;

import java.util.Arrays;

public class RemoveCoveredIntervals {


        /*
         * LeetCode 1288 - Remove Covered Intervals
         *
         * Problem:
         * Given a list of intervals, remove the intervals that are
         * completely covered by another interval.
         *
         * Return the number of intervals remaining after removing
         * all covered intervals.
         *
         * Example:
         * Input:
         * [[1,4], [3,6], [2,8]]
         *
         * [1,4] is covered by [2,8]? No.
         * [3,6] is covered by [2,8] -> remove it.
         *
         * Answer = 2
         *
         * Approach:
         * 1. Sort intervals by start in ascending order.
         * 2. If start values are equal, sort end in descending order.
         *
         * Why descending end?
         * If two intervals have the same start:
         *
         * [1,5], [1,3]
         *
         * We want [1,5] first because it covers [1,3].
         *
         * 3. Maintain maxEnd = maximum end seen so far.
         * 4. If current end > maxEnd, this interval is NOT covered,
         *    so increment count.
         * 5. Otherwise, current interval is covered.
         *
         * Time Complexity: O(n log n)
         * Space Complexity: O(1) extra space (excluding sorting)
         */

        public int removeCoveredIntervals(int[][] intervals) {

            // Sort:
            // 1. Start -> ascending
            // 2. End   -> descending when start is same
            Arrays.sort(intervals, (a, b) -> {
                int val = Integer.compare(a[0], b[0]);

                return val == 0
                        ? Integer.compare(b[1], a[1])
                        : val;
            });

            int maxEnd = intervals[0][1];
            int count = 1;

            for (int i = 1; i < intervals.length; i++) {

                // Current interval is not covered
                if (maxEnd < intervals[i][1]) {
                    maxEnd = intervals[i][1];
                    count++;
                }

                // Otherwise, current interval is covered
            }

            return count;
        }

        public static void main(String[] args) {

            RemoveCoveredIntervals obj = new RemoveCoveredIntervals();

            int[][] intervals = {
                    {1, 4},
                    {3, 6},
                    {2, 8}
            };

            int result = obj.removeCoveredIntervals(intervals);

            System.out.println("Remaining intervals: " + result);
        }
    }

