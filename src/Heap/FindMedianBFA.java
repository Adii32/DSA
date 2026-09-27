package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMedianBFA {
    List<Integer> list;
    FindMedianBFA(List<Integer> list){
       this.list = new ArrayList<>();
    }
    public void addNum(int n){
        list.add(n);
    }
    public  double findMedian(){
        Collections.sort(list);
        if(list.size()%2==0){
            return (list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;

        }
        return list.get(list.size()/2);
    }
    public static void main(String[] args) {

        FindMedianBFA obj = new FindMedianBFA(new ArrayList<>());

        obj.addNum(1);
        System.out.println(obj.findMedian()); // 1.0

        obj.addNum(2);
        System.out.println(obj.findMedian()); // 1.5

        obj.addNum(3);
        System.out.println(obj.findMedian()); // 2.0

        obj.addNum(4);
        System.out.println(obj.findMedian()); // 2.5

        obj.addNum(5);
        System.out.println(obj.findMedian()); // 3.0
    }
}
