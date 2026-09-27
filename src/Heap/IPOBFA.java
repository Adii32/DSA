package Heap;

import java.util.ArrayList;
import java.util.List;

public class IPOBFA {

public static int  findMaximumProfit(int capitals[],int profits[],int w,int k){
    List<Integer> profit = new ArrayList<>();
    List<Integer> capital = new ArrayList<>();
    for(int c : capitals){
        capital.add(c);
    }
    for(int p : profits){
        profit.add(p);
    }
    int cc=w;

    //Time Complexity => 0(k.n)
    //spance complexity => O(n)
    for(int proj=0;proj<k;proj++ ){
        int maxProf =-1;
        for(int cap=0;cap<capital.size();cap++){
            if(maxProf==-1){
                maxProf=cap;

                continue;
            }

            if(profit.get(cap)>profit.get(maxProf)){
                maxProf = cap;
            }
        }

        if(maxProf==-1){
            return cc;
        }
        cc+=profit.get(maxProf);
        //cc=9
        profit.remove(maxProf);
        capital.remove(maxProf);
    }
    return cc;
}
public static void main(String [] args){
int profits[] = {4,3,6,3};
int capitals[] = {5,1,3,4};
System.out.println(findMaximumProfit(capitals,profits,3,2));
}
}
