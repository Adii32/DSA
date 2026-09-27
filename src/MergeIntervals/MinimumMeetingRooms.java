package MergeIntervals;

import java.util.Map;
import java.util.TreeMap;

public class MinimumMeetingRooms {


        /*
         * GFG - Meeting Rooms
         *
         * Given two arrays:
         *
         * start[] -> starting time of each meeting
         * end[]   -> ending time of each meeting
         *
         * Find the minimum number of meeting rooms required
         * so that all meetings can be conducted without conflict.
         *
         * Example:
         *
         * start = [1, 10, 7]
         * end   = [4, 15, 10]
         *
         * Meetings:
         * [1,4]
         * [10,15]
         * [7,10]
         *
         * Maximum number of meetings happening at the same time
         * determines the minimum number of rooms required.
         *
         * Approach:
         * 1. Use TreeMap to store events.
         * 2. At start time -> +1 meeting.
         * 3. At end time   -> -1 meeting.
         * 4. TreeMap automatically keeps times sorted.
         * 5. Traverse the events and maintain current meetings.
         * 6. Keep the maximum value of current meetings.
         *
         * Time Complexity: O(n log n)
         * Space Complexity: O(n)
         */

        public int minMeetingRooms(int[] start, int[] end) {

            Map<Integer, Integer> map = new TreeMap<>();

            for (int i = 0; i < start.length; i++) {

                // Meeting starts -> +1
                map.put(start[i],
                        map.getOrDefault(start[i], 0) + 1);

                // Meeting ends -> -1
                map.put(end[i],
                        map.getOrDefault(end[i], 0) - 1);
            }

            int count = 0;
            int max = 0;

            // TreeMap gives times in sorted order
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {

                count += m.getValue();

                max = Math.max(max, count);
            }

            return max;
        }

        public static void main(String[] args) {

            MinimumMeetingRooms obj = new MinimumMeetingRooms();

            int[] start = {1, 10, 7};
            int[] end = {4, 15, 10};

            int result = obj.minMeetingRooms(start, end);

            System.out.println("Minimum meeting rooms required: " + result);
        }
    }

