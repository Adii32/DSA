package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
public static int find(int arr[]){
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int val : arr){
        pq.add(val);
    }
    //{2,7,4,1,8,1};
    //8,7,4,2,1,1
    while(pq.size()>1){

        int stone1 = pq.poll();
        int stone2 = pq.poll();
        if(stone1==stone2){
            continue;

        }
        pq.add(stone1-stone2);
    }
    return pq.size()==0?0 : pq.peek();
}
    public static void main(String [] args){
        int arr[] = {2,7,4,1,8,1};
        System.out.print(find(arr));
    }
}
