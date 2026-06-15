package TwoPointer;

public class TwoSum {
    public static boolean find(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
        }
        return false;
    }
    public static void main(String [] args) {
        int arr[] = {3,2,4};
        System.out.print(find(arr,9));
    }
}
