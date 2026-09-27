package Heap;

import java.util.List;
import java.util.PriorityQueue;

public class FindRightIntervalsOptimize {
//    public static int[] find(int arr[][]){
//        PriorityQueue<int[]> minStart = new PriorityQueue<>((a,b)->a[0]-b[0]);
//PriorityQueue<int[]> minEnd = new PriorityQueue<>((a,b)->a[0]-b[0]);
//int res[] = new int[arr.length];
//for(int i=0;i<arr.length;i++){
//    res[i]=-1;
//    minEnd.add(new int[] { arr[i][1],i});
//    minStart.add(new int[] {arr[i][0],i});
//}
//        //{3,4},{2,3},{1,2}
//        //minStart = {3,0}
//        //minEnd = {3,1}{4,0}
//while(!minEnd.isEmpty() && !minStart.isEmpty()){
//    int[]values = minStart.peek();
//    int start = values[0];
//    int ind = values[1];
//    if(start>=minEnd.peek()[0])
//    {
//        res[minEnd.peek()[1]] = ind;
//        minEnd.poll();
//    }
//    else {
//        minStart.poll();
//    }
//}
//return res;
//    }
    public static int[] find(int arr[][]){
        PriorityQueue<int[]> minStart = new PriorityQueue<>((a,b)->a[0]-b[0]);
        PriorityQueue<int[]> minEnd = new PriorityQueue<>((a,b)->a[0]-b[0]);
        int res[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=-1;
            minStart.add(new int[] { arr[i][0],i });
            minEnd.add(new int[] { arr[i][1],i});
        }
        while(!minStart.isEmpty() && !minEnd.isEmpty()){
           int[] values = minStart.peek();
           int startTime = values[0];
           int ind = values[1];
           if(startTime>=minEnd.peek()[0]){
               res[minEnd.peek()[1]] = ind;
               minEnd.poll();
           }
           else {
               minStart.poll();
           }
        }
        return res;
    }
    public static void main(String [] args){
        int arr[][] = {{3,4},{2,3},{1,2}};
        int ans[] = find(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
