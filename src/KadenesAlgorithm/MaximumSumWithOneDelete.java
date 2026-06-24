package KadenesAlgorithm;

public class MaximumSumWithOneDelete {
    public static int find(int arr[]){
        int oneDelete= Integer.MAX_VALUE;
        int noDelete = arr[0];
        int res =arr[0];
        for(int i=1;i<arr.length;i++){
            int prevDelete = noDelete;
            noDelete = Math.max(arr[i],arr[i]+noDelete);

        
            oneDelete = Math.max(prevDelete,oneDelete+arr[i]);


            res = Math.max(res,Math.max(noDelete,oneDelete));

        }
        return res;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,-4,5};
        int ans = find(arr);
        System.out.println(ans);
    }
}
