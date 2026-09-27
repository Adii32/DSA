package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedian {
   PriorityQueue<Integer> maxHeap;
   PriorityQueue<Integer> minHeap;
   FindMedian(){
       maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       minHeap = new PriorityQueue<>();
   }
   public void addNumber(int num){
       if(maxHeap.size()==0){
            maxHeap.add(num);
            return;
       }
      if(maxHeap.size()==minHeap.size()){
          if(num>maxHeap.peek()){
              minHeap.add(num);
              maxHeap.add(minHeap.poll());
          }
          else {
              maxHeap.add(num);
          }
      }
      else {
          maxHeap.add(num);
          minHeap.add(maxHeap.poll());

      }

   }
   public double find(){
       if(maxHeap.size()==minHeap.size()){
           return (maxHeap.peek()+minHeap.peek())/2.0;
       }
       return maxHeap.peek();
   }
    public static  void main(String [] args){
        FindMedian fm = new FindMedian();
        fm.addNumber(1);
        fm.addNumber(2);
//        fm.addNumber(3);

        fm.addNumber(4);
        fm.addNumber(5);
        System.out.println(fm.find());
    }
}
