package TwoPointer;

public class TwoSum {
    public static int[] find(int arr[],int target){
      int left=0;
      int right=arr.length-1;
      while(left<right){
          int sum = arr[left]+arr[right];
          if(sum<target){
              left++;

          }
          else if(sum>target){
              right--;
          }
          else if(sum==target){
              return new int[]{
                      left+1,right+1
              };
          }

      }
      return new int[]{
              -1,-1
      };
    }
    public static void main(String [] args) {
        int arr[] = {5,3,2,4,};
       int ans[] = find(arr,9);
       for(int i=0;i<ans.length;i++){
           System.out.println(ans[i]);
       }
    }
}
