package MergeIntervals;

import java.util.Arrays;

public class CountDaysWithoutMeeting {

        /*
         * LeetCode 3169 - Count Days Without Meetings
         *
         * Given:
         *  - 'days' = total number of days
         *  - meetings[i] = [startDay, endDay]
         *
         * Find the number of days on which there are NO meetings.
         *
         * Approach:
         * 1. Sort meetings according to start day.
         * 2. Merge overlapping meetings by maintaining maxEnd.
         * 3. Whenever a gap is found between two meetings,
         *    add the number of free days to 'gap'.
         * 4. Finally add free days before the first meeting
         *    and after the last meeting.
         *
         * Time Complexity:
         * O(n log n) -> sorting
         *
         * Space Complexity:
         * O(1) extra space (excluding sorting space)
         */

        public int countDays(int days, int[][] meetings) {

            // Sort meetings according to start day
            Arrays.sort(meetings, (a, b) ->
                    Integer.compare(a[0], b[0]));

            // End day of the first meeting
            int maxEnd = meetings[0][1];

            int gap = 0;

            // Check gaps between meetings
            for (int i = 1; i < meetings.length; i++) {

                // There is a free gap between previous meeting
                // and current meeting
                if (maxEnd < meetings[i][0]) {

                    gap += meetings[i][0] - maxEnd - 1;
                }

                // Merge overlapping meetings
                maxEnd = Math.max(maxEnd, meetings[i][1]);
            }

            // Free days before the first meeting
            gap += meetings[0][0] - 1;

            // Free days after the last meeting
            gap += days - maxEnd;

            return gap;
        }

        public static void main(String[] args) {

            CountDaysWithoutMeeting obj = new CountDaysWithoutMeeting();

            int days = 10;

            int[][] meetings = {
                    {5, 7},
                    {1, 3}
            };

            int result = obj.countDays(days, meetings);

            System.out.println("Days without meetings: " + result);
        }
    }

