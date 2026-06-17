package TwoPointer;

import java.util.Arrays;

public class TripletSumEqualsToZero {
//     Given an integer array arr, find one triplet whose sum is equal to 0.

// Return the three numbers if such a triplet exists. If no triplet exists, return an empty array.
    public static int[] find(int arr[]){
        int value[] = new int[3];
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            int sum = -1*arr[i];
            while(left<right){
                int sum2= arr[left]+arr[right];
                if(sum==sum2){
                    value[0] = arr[i];
                    value[1] = arr[left];
                    value[2] = arr[right];
                    left++;
                    right--;
                }
                else if(sum2>0){
                    right--;
                }
                else if(sum<0){
                    left++;
                }
            }
        }
        return value;
    }
    public static void main(String [] args) {
        int arr[] = {1, 2, -3, 4, 5, 6};
        System.out.print(Arrays.toString(find(arr)));
    }
}
