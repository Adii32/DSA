package TwoPointer;

public class CountTripletSumLessThanTarget {
public static int find(int arr[],int target)
{
    int count=0;
    for(int i=0;i<arr.length-2;i++){
        int left=i+1;
        int right=arr.length;
        while(left<right){
            int sum = arr[i]+arr[left]+arr[right];
            if(sum<target){
                count+=right-left;
                left++;
            }
            else if(sum>=target){
                right--;
            }
        }
    }
    return count;
}
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6};
        int found = find(arr,15);
    }
}
