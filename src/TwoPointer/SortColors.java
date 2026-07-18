package TwoPointer;

public class SortColors {
    public static void sort(int arr[]){
        int i=0;
        int j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
            else if(arr[j]==2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
            else {
                j++;
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
