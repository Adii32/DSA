package PrefixSum;

import java.util.HashMap;

public class HowManySubarrayMultipleOfK {
    public static int find(int arr[],int k){
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int res =0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem = sum%k;
            if(rem<0){
                rem +=k;
            }
            res+=map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);

        }
        return res;
    }
    public static void main(String [] args){
        int arr[] = {4,5,0,-2,-3,1};
        int ans = find(arr,5);
        System.out.println(ans);
    }
}
