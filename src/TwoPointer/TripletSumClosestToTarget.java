package TwoPointer;

public class TripletSumClosestToTarget {
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
        int arr[] = {1,2,3,4,5,6,7};
        int found = find(arr,20);
        System.out.println(found);
    }
}
