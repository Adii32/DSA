package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ConstructTargetArrayWithMultipleSumBFA {
    public static boolean find(int arr[]){
 //sum=all elements
  //max Heap
  //max Heap -> put all elements int the max Heap
  //while()
  //rest = sum-val (9+3+5) - 9 =>(3+5)
  //val = val-rest =>1
  //put val back in the heap
  //sum = rest + val
   //if(val==1) return true;
     //   T: O(n)

//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//        int sum=0;
//        for(int ele : arr){
//            sum+=ele;
//            maxHeap.add(ele);
//        }
        //O(n+ M.logn)
//        while(true){
//            int val = maxHeap.poll();
//            if(val==1){
//                return true;
//            }
//            int rest = sum-val;
//            val = val-rest;
//           if(val<=0){
//               return false;
//           }
//           maxHeap.add(val);
//           sum = rest+val;
//        }
        if(arr.length==0){
            return arr[0]==1;
        }
        long  sum=0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            sum+=ele;
            maxHeap.add(ele);
        }
       while(true){
       int val = maxHeap.poll();
       if(val==1){
           return true;
       }
       long rest = sum-val;
     int mod = (int)(val%rest);
       if(rest==1){
           return true;
       }
       if(mod==val){
           return false;
       }
       if(mod==0){
           return false;
       }
       maxHeap.add(mod);
       sum = rest+mod;
       }
    }
    public static void main(String [] args){
        int arr[] = {9,3,5};
        System.out.println(find(arr));
    }
}
