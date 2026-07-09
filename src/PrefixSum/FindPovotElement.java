package PrefixSum;

public class FindPivotElement {
    public static int find(int arr[]){
        int left=0;
        int right=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=1;i<arr.length;i++){
         
            right= sum-arr[i]-left;
            if(left==right){
                return i;
             }
                left+=arr[i];
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[] = {1,7,3,6,5,6};
        int ans = find(arr);
        System.out.println(ans);
    }
}
