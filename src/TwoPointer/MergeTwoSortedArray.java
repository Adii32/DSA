package TwoPointer;


public class MergeTwoSortedArray {
//     You are given two sorted integer arrays arr1 and arr2 in ascending order.

// Merge both arrays into a single sorted array and return it.
    public static int[] find(int arr1[],int arr2[]) {
        int temp[] = new int[arr1.length+arr2.length];
        int index=0;
        int left=0;
        int right=0;
        while(left<arr1.length && right<arr2.length) {
            if(arr1[left]<=arr2[right]) {
                temp[index]=arr1[left];
                index++;
                left++;
            }
            else {
                temp[index]=arr2[right];
                right++;
                index++;
            }
        }
        while(right<arr2.length) {
            temp[index]=arr2[right];
            right++;
            index++;
        }
        while(left<arr1.length) {
            temp[index]=arr1[left];
            left++;
            index++;
        }
        return temp;

    }
    public static void main(String [] args) {
        int arr1[] = {1,3,4};
        int arr2[] = {2,5,4,56};

        int temp[] = find(arr1,arr2);
        for(int i=0;i<temp.length;i++) {
            System.out.println(temp[i]);
        }
    }
}
