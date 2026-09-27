package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestNumberAfterSwapByParityOptimize {
public static int find(int n){
    String num = String.valueOf(n);
    PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> odd  = new PriorityQueue<>(Collections.reverseOrder());
    for(char c : num.toCharArray()){
        int val = c-'0';
        if(val%2==0){
            even.add(val);
        }
        else
        {
            odd.add(val);
        }
    }
    StringBuilder sb = new StringBuilder();
    for(char c : num.toCharArray()){
        int val = c-'0';
        if(val%2==0){
            sb.append(even.poll());
        }
        else {
            sb.append(odd.poll());
        }
    }
    return Integer.parseInt(sb.toString());
}
    public static void main(String [] args){
        int value = 12345;
        System.out.println(find(value));
    }
}
