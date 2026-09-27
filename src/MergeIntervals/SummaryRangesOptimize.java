package MergeIntervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SummaryRangesOptimize {

    Set<Integer> list;

    public SummaryRangesOptimize() {
        list = new TreeSet<>();
    }

    public void addNum(int value) {


        list.add(value);
    }

    public int[][] getIntervals() {

        if (list.size() == 0) {
            return new int[][]{};
        }



        Integer left = null;
        Integer right = null;

        List<int[]> res = new ArrayList<>();

        for (int i : list) {

            if (left == null && right == null) {
                left = i;
                right = i;
            }
            else if (i == right + 1) {
                right = i;
            }
            else {
                res.add(new int[]{
                        left, right
                });

                left = i;
                right = i;
            }
        }

        res.add(new int[]{
                left, right
        });

        int[][] result = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }

    public static void printIntervals(int[][] intervals) {

        System.out.print("[ ");

        for (int i = 0; i < intervals.length; i++) {

            System.out.print(
                    "[" + intervals[i][0] + ", " + intervals[i][1] + "]"
            );

            if (i < intervals.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }

    public static void main(String[] args) {

        SummaryRangesOptimize summaryRanges = new SummaryRangesOptimize();

        summaryRanges.addNum(1);
        printIntervals(summaryRanges.getIntervals());

        summaryRanges.addNum(3);
        printIntervals(summaryRanges.getIntervals());

        summaryRanges.addNum(7);
        printIntervals(summaryRanges.getIntervals());

        summaryRanges.addNum(2);
        printIntervals(summaryRanges.getIntervals());

        summaryRanges.addNum(6);
        printIntervals(summaryRanges.getIntervals());
    }
}