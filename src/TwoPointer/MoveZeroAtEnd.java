package TwoPointer;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String [] args){
        int arr[] = {0,1,0,2,0,3,4};
        int left=0;
        int right=1;
        while(right<arr.length){
            if(arr[left]==0 && arr[right]!=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
                left++;
                right++;
            }
            else if(arr[right]==0){
                right++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
