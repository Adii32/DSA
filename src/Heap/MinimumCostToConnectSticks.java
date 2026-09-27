package Heap;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {
    public static int find(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sum=0;
        while(pq.size()>1){

           int s1 = pq.poll();
           int s2 = pq.poll();
           sum+=s1+s2;
           pq.add(s1+s2);
        }
        return sum;
    }
    public static void main(String [] args){
        int arr[] = {4,3,2,6};
        System.out.println(find(arr));
    }
}
