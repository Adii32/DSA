package KadenesAlgorithm;

public class SubArrayMaximumSumWithNegativeNumbers {
    //find maximum sum including nagetive number 
    public static int find(int arr[]){
        int bestEnding = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = bestEnding+arr[i];
            int v2 = arr[i];
            bestEnding = Math.max(v1,v2);
            ans = Math.max(ans,bestEnding);
        }
        return ans;
    }
    public static void main(String [] args){
        int arr[] = {-2,1,2,-4,5};
        int value = find(arr);
        System.out.println(value);
    }
}
