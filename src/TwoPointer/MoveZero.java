package TwoPointer;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,2,1,0,1,1};
        int fast=0;
        int slow=0;
        while(fast<arr.length){
            if(arr[fast]!=0){
                arr[slow]=arr[fast];
                slow++;
            }
            fast++;
        }
        for(int i=slow;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
