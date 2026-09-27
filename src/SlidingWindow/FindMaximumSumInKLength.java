package SlidingWindow;

public class FindMaximumSumInKLength {
//    Find the Maximum Sum of a Subarray of Size K
//
//    Given an integer array arr and a positive integer k,
//    find the maximum sum among all
//    contiguous subarrays of size k.
    public static int find(int arr[],int k){
//        int sum=0;
//        int low=0;
//        int high=k-1;
//        for(int i=low;i<=high;i++){
//            sum+=arr[i];
//        }
//        int maxSum = Integer.MIN_VALUE;
//     while(high<arr.length){
//         maxSum = Math.max(maxSum,sum);
//         high++;
//         low++;
//         if(high==arr.length){
//             break;
//         }
//         sum = sum-arr[low-1];
//         sum = sum+arr[high];
//     }
//     return maxSum;
        int sum=0;
        for(int i=0;i<k;i++){
          sum+=arr[i];
        }
        int max = Integer.MIN_VALUE;
        max = Math.max(max,sum);
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            max = Math.max(max,sum);
        }
        return max;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int found = find(arr,3);
        System.out.println(found);
    }
}
