package TwoPointer;

public class RemoveSpecificElement {
    public static int remove(int arr[],int target) {
int fast=0;
int slow=0;
while(fast<arr.length){
    if(arr[fast]!=target){
        arr[slow]=arr[fast];
        slow++;
    }
    fast++;
}
return slow;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 5};
        int value = remove(arr, 3);
        for (int i = 0; i < value; i++) {
            System.out.println(arr[i]);
        }
    }
}