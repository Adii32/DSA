package TwoPointer;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int remove(int arr[]){
        int left=0;
        int right=0;
        int index=1;
    while(right<arr.length){
        if(arr[left]==arr[right]){
            right++;
        }
        else {
            arr[index]=arr[right];
            left=right;
            right++;
            index++;
        }
    }
return index;
    }
    public static void main(String [] args){
        int arr[] = {1,2,2,3,3,4,5};
        int value = remove(arr);
       for(int i=0;i<value;i++){
           System.out.println(arr[i]);
       }
    }
}
