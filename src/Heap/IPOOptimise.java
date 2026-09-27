package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class IPODetails{
    int profit;
    int capital;

    public IPODetails(int profit, int capital) {
        this.profit = profit;
        this.capital = capital;
    }
}
public class IPOOptimise {
    public static int find(int profit[],int capital[],int w,int k){
        IPODetails projectDetails[] = new IPODetails[profit.length];
        for(int i=0;i<profit.length;i++){
            projectDetails[i] = new IPODetails(profit[i],capital[i]);
        }

        Arrays.sort(projectDetails,(a, b)->a.capital-b.capital);
        //{1,2,3};
 //{0,1,2};
        //{1,0}{2,1}{3,2}
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int cc=w;
        int p=0;
        for(int proj=0;proj<k;proj++){
            if(p<projectDetails.length && cc>=projectDetails[proj].capital){
                maxHeap.add(projectDetails[proj].profit);
                p++;
            }
            if(maxHeap.size()==0){
                return cc;
            }
            cc+=maxHeap.poll();
        }
        return cc;
    }
    public static void main(String [] args){
      int k = 3, w = 0;
      int profits []= {1,2,3};
      int capital[] = {0,1,2};
      System.out.println(find(profits,capital,w,k));
    }
}
