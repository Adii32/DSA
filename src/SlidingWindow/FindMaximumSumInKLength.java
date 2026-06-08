package SlidingWindow;

public class FindMaximumSumInKLength {
    public static int find(int arr[],int k){
        int sum=0;
        int low=0;
        int high=k-1;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
     while(high<arr.length){
         maxSum = Math.max(maxSum,sum);
         high++;
         low++;
         if(high==arr.length){
             break;
         }
         sum = sum-arr[low-1];
         sum = sum+arr[high];
     }
     return maxSum;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int found = find(arr,3);
        System.out.println(found);
    }
}
