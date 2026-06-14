package KadenesAlgorithm;

public class SubArrayWithMaxProduct {
    public static int find(int arr[]){
        int maxEnding = arr[0];
        int minEnding = arr[0];
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            int v1 = maxEnding*arr[i];
            int v2 = minEnding*arr[i];
            int v3 = arr[i];
            maxEnding = Math.max(v1,Math.max(v2,v3));
            minEnding = Math.min(v1,Math.max(v2,v3));
            ans = Math.max(ans,Math.max(maxEnding,minEnding));
        }
        return ans;
    }
    public static void main(String [] args){
        int arr[] = {-2,-4,-3,-5,1,-3};
        int value = find(arr);
        System.out.println(value);

    }
}
