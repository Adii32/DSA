package TwoPointer;

import java.util.Arrays;

public class SortZeroOneTwo {
    public static void sort(int arr[]){
        int start=0;
        int mid=start+1;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                mid++;
                start++;
            }
            else if(arr[mid]==2){
                int temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }
            else {
                mid++;
            }
        }
    }
    public static void main(String [] args){
        int arr[] ={1,2,1,1,0,0,1,1,0,1} ;
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
