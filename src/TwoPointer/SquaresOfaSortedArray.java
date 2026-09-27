package TwoPointer;

import java.util.Arrays;

public class SquaresOfaSortedArray {
    public static int[] find(int arr[]){
        int[] temp = new int[arr.length];
        int i=0;
        int j=arr.length-1;
        int k=arr.length-1;
        while(i<=j){
            int left = arr[i]*arr[i];
            int right = arr[j]*arr[j];
            if(right>left){
                temp[k] = right;
                j--;
            }
            else {
                temp[k]=left;
                i++;
            }
k--;
        }
        return temp;
    }
    public static void main(String [] args){
        int[] values = {-8,7,6};

        System.out.print(Arrays.toString(find(values)));
    }
}

