package TwoPointer;

import java.util.Arrays;

public class TwoSumWIthUnique {
//    Given a sorted integer array that may contain duplicate elements,
//    return a unique pair of numbers whose sum is equal to the target.
//    If no such pair exists, return a default value (or an empty array).
    public static int[] find(int arr[],int target){
        int temp[] = new int[2];
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                temp[0]=arr[left];
                temp[1] = arr[right];
                left++;
                right--;
                while(arr[left]==arr[left-1]) left++;
                while(arr[right]==arr[right+1]) right--;
            }
            else if(sum>target) {
                right--;
            }
            else if(sum<target){
                left++;
            }
        }
        return temp;
    }
    public static void main(String [] args){
        int arr[] = {3,2,4};
        int temp[] = find(arr,4);
        System.out.println(Arrays.toString(temp));
    }
}
