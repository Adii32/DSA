package TwoPointer;

public class SortColors {
    public static void sort(int arr[]){
    int left=0;
    int right=arr.length-1;
    int mid=0;


    while(mid<=right){
        if(arr[mid]==0){
            int temp = arr[mid];
            arr[mid] = arr[left];
            arr[left] = temp;
            mid++;
            left++;
        }
        else if(arr[mid]==2){
            int temp = arr[mid];
            arr[mid] = arr[right];
            arr[right] = temp;
            right--;
        }
        else {
            mid++;
        }
    }

    }
    public static void main(String [] args){
        int arr[] = {1,0,2,1,0,0};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
