package TwoPointer;

public class SortTwoColor {
    public static void sort(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
           if(arr[i]==0){
i++;
           }
           else {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;

               j--;
           }
        }
    }
    public static void main(String [] args){
        int arr[] = {0,1,1,1,0,0,0};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
