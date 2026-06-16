package TwoPointer;

public class TripletSumClosestToTarget {
//    Given an integer array nums and an integer target, find three integers in the array
//    such that their sum is closest to the target. Return the sum of
//    the three integers. You may assume that each input has exactly one solution.
    public static int find(int arr[],int target){
        int minDiff = Integer.MAX_VALUE;
        int value =0;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;

            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                int diff = Math.abs(target-sum);
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    if(diff<minDiff){
                        minDiff = diff;
                        value = sum;
                    }
                   left++;
                }
                else if(sum>target){
                    right--;
                }

            }
        }
        return value;
    }
    public static void main(String [] args){
        int arr[] = {0,1,2,2};
        int found = find(arr,6);
        System.out.println(found);
    }
}
