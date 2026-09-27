package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {


        public int[][] insert(int[][] intervals, int[] newInterval) {

            List<int[]> list = new ArrayList<>();

            int i = 0;

            // Add intervals which come completely before newInterval
            while (i < intervals.length &&
                    intervals[i][1] < newInterval[0]) {

                list.add(intervals[i]);
                i++;
            }

            // Merge overlapping intervals
            while (i < intervals.length &&
                    intervals[i][1] >= newInterval[0] &&
                    intervals[i][0] <= newInterval[1]) {

                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);

                i++;
            }

            // Add merged newInterval
            list.add(newInterval);

            // Add remaining intervals
            while (i < intervals.length) {
                list.add(intervals[i]);
                i++;
            }

            // Convert List<int[]> to int[][]
            int[][] res = new int[list.size()][2];

            for (int j = 0; j < list.size(); j++) {
                res[j] = list.get(j);
            }

            return res;
        }

        public static void main(String[] args) {

            InsertInterval obj = new InsertInterval();

            int[][] intervals = {
                    {1, 3},
                    {6, 9}
            };

            int[] newInterval = {2, 5};

            int[][] result = obj.insert(intervals, newInterval);

            System.out.println("Result:");

            for (int[] interval : result) {
                System.out.println(
                        "[" + interval[0] + ", " + interval[1] + "]"
                );
            }
        }
    }

