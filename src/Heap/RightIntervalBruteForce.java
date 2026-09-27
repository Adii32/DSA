package Heap;

import java.util.ArrayList;
import java.util.List;

public class RightIntervalBruteForce {
//    public static List<Integer> find(int [][] intervals){
//  List<Integer> list = new ArrayList<>();
////  [3,4],[2,3],[1,2]
//
//        for(int i=0;i<intervals.length;i++){
//            int endTime=intervals[i][1];
//          int minInd=-1;
//            boolean f=false;
//            //endTime = 3
//            for(int j=0;j<intervals.length;j++) {
//
//                if (intervals[j][0] >= endTime) {
//
//                    if (minInd==-1 || intervals[j][0] < intervals[minInd][0]) {
//
//                        minInd = j;
//                    }
//                }
//            }
//
//                    list.add(minInd);
//
//
//            }
//
//        return list;
//    }
public static List<Integer> find(int arr[][]){
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        int endTime = arr[i][1];
        int minInd=-1;
        for(int j=0;j< arr.length;j++){
            if(arr[j][0]>=endTime){
                if(minInd==-1 || arr[j][0]<arr[minInd][0]){
                    minInd=j;
                }
            }
        }
        list.add(minInd);
    }
    return list;
}
    public  static  void main(String [] args){
        int arr[][] = {{3,4},{2,3},{1,2}};
        System.out.println(find(arr));
    }
}
