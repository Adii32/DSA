package SlidingWindow;

public class FindMaximumLengthWhichSumLessThanEqualToTarget {
//    Find the Maximum Length Subarray with Sum Less Than or Equal to K
//    Given an array of positive integers arr[] and an integer K,
//    find the maximum length of a contiguous subarray
//    whose sum is less than or equal to K.
    public static int find(int arr[],int target){
        int low=0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int high=0;high<arr.length;high++){
            sum+=arr[high];
            while(sum>target){
                sum-=arr[low];
                low++;
            }
            max = Math.max(max,high-low+1);
        }
        return max;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        int found = find(arr,target);
        System.out.println(found);
    }
}
