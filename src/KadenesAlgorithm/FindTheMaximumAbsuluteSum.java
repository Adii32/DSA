package KadenesAlgorithm;

public class FindTheMaximumAbsuluteSum {
    public static int findMax(int arr[]){
        int maxEnding = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = maxEnding+arr[i];
            int v2 = arr[i];
            maxEnding = Math.max(v1,v2);
            ans = Math.max(ans,maxEnding);
        }
        return ans;
    }
    public static int findMin(int arr[]){
        int minEnding = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = minEnding+arr[i];
            int v2 = arr[i];
            minEnding = Math.min(v1,v2);
            ans = Math.min(ans,minEnding);
        }
        return ans;
    }
    public static void main(String [] args){
        int arr[] = {1,2,-3,4,-4,4,-5,-6};
        int max = Math.max(Math.abs(findMax(arr)),Math.abs(findMin(arr)));
        System.out.println(max);
    }
}
