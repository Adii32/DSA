package PrefixSum;

import java.util.HashMap;

public class HowManySubArraysWhichSumEqualToK {
    public static int find(int arr[],int k){
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int ques = sum-k;
            int freq = map.getOrDefault(ques,0);
            res+=freq;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
    public static void main(String [] args){
        int arr[] = {1,1,1};
        int ans = find(arr,2);
        System.out.println(ans);
    }
}
