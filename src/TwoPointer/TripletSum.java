package TwoPointer;

import java.util.Arrays;

public class TripletSum {
//    view Question
//
//    Given a sorted array of integers and a target value, find any
//    three numbers whose sum is equal to the target. Return
//    the triplet. If no such triplet exists, return
//    an empty array (or a default value).
    public static int[] find(int arr[],int target){
        int value[] = new int[3];
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;

            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==target){
                    value[0] = arr[i];
                    value[1] = arr[left];
                    value[2] = arr[right];
                    left++;
                    right--;
                }
                else if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }
            }
        }
        return value;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7};
      int values[] = find(arr,18);
      System.out.println(Arrays.toString(values));
    }
}
