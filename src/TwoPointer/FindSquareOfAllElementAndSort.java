package TwoPointer;


public class FindSquareOfAllElementAndSort {
    public static int[] find(int arr[]) {

        int left=0;
        int right=arr.length-1;
        int index=arr.length-1;
        int temp[] = new int[arr.length];

        while(left<=right) {
            if(Math.abs(arr[left])>Math.abs(arr[right])) {
                temp[index]=arr[left]*arr[left];
                left++;
            }
            else {
                temp[index] = arr[right]*arr[right];
                right--;
            }
            index--;

        }
        return temp;
    }
    public static void main(String [] args) {
        int arr1[] = {1,3,4};

        int temp[] = find(arr1);
        for(int i=0;i<temp.length;i++) {
            System.out.println(temp[i]);
        }
    }
}



