package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumEqualsToZero {
//     Given an integer array arr, find one triplet whose sum is equal to 0.

// Return the three numbers if such a triplet exists. If no triplet exists, return an empty array.
    public static List<List<Integer>> find(int arr[]){
        Arrays.sort(arr);
     int j=1;
     int k = arr.length;
     List<List<Integer>> list = new ArrayList<>();
     for(int i=0;i<arr.length;i++){
         if(arr[i]>0){
             break;
         }
         if(i==0 || arr[i]!=arr[i-1]){
             j=i+1;
             k=arr.length-1;
             int ele = arr[i];
             while(j<k){
                 int sum = ele+arr[j]+arr[k];
                 if(sum==0){
                     list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                     j++;
                     k--;
                 }
                 else if(sum<0){
                     j++;
                 }
                 else if(sum>0){
                     k--;
                 }
             }
         }
     }
     return list;
    }
    public static void main(String [] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.print(find(arr));
    }
}
