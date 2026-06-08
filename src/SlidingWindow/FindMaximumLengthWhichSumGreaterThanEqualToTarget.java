package SlidingWindow;

public class FindMaximumLengthWhichSumGreaterThanEqualToTarget {
    public static int find(int arr[],int target){
        int low=0;
        int high=0;
        int min = Integer.MAX_VALUE;
        int sum=0;
        while(high<arr.length){
           sum+=arr[high];
           while(sum>=target){
               int len = (high-low)+1;
               min = Math.min(len,min);
               sum = sum-arr[low];
               low++;
           }
           high++;
        }
        return min;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        int found = find(arr,target);
        System.out.println(found);
    }
}
