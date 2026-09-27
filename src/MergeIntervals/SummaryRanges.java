package MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {
    List<Integer> list;
    public SummaryRanges() {
        list = new ArrayList<>();
    }

    public void addNum(int value) {

        if(list.contains(value)){
            return;
        }
        list.add(value);
    }

    public int[][] getIntervals() {
        if(list.size()==0){
            return new int[][]{};
        }
        Collections.sort(list);
        Integer left = null;
        Integer right = null;
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(left==null && right==null){
                left = list.get(i);
                right = list.get(i);
            }
            else if(list.get(i)==right+1){
                right = list.get(i);
            }
            else {
                res.add(new int[]{
                        left,right
                });
                left = list.get(i);
                right = list.get(i);
            }
        }
        res.add(new int[]{
                left,right
        });
        int[][] result = new int[res.size()][2];
        for(int i=0;i<res.size();i++){
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

        SummaryRanges summaryRanges = new SummaryRanges();

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
