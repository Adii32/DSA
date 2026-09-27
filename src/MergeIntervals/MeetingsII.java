package MergeIntervals;

import java.util.Arrays;

public class MeetingsII {


        /*
         * Question: Meeting Rooms
         *
         * Given an array of meeting intervals where
         * intervals[i] = [startTime, endTime],
         *
         * return true if a person can attend all meetings
         * without any overlap.
         *
         * Example:
         * Input:
         * [[0,30], [5,10], [15,20]]
         *
         * Output:
         * false
         *
         * Because [0,30] overlaps with [5,10] and [15,20].
         *
         * Approach:
         * 1. Sort intervals by start time.
         * 2. Compare the current meeting's start time
         *    with the previous meeting's end time.
         * 3. If they overlap, return false.
         * 4. Otherwise return true.
         *
         * Time Complexity: O(n log n)
         * Space Complexity: O(1) extra space
         */

        static boolean canAttend(int[][] arr) {

            // Sort meetings by start time
            Arrays.sort(arr, (a, b) ->
                    Integer.compare(a[0], b[0]));

            for (int i = 1; i < arr.length; i++) {

                int s2 = arr[i][0];

                // Previous meeting end
                int e1 = arr[i - 1][1] - 1;

                // Check overlap
                if (s2 <= e1) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            int[][] meetings = {
                    {0, 30},
                    {5, 10},
                    {15, 20}
            };

            boolean result = canAttend(meetings);

            System.out.println("Can attend all meetings: " + result);
        }
    }

