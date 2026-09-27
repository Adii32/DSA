package Heap;

import java.util.PriorityQueue;

class CharacterCount{
    char c;
    int count;
    CharacterCount(char c,int count){
        this.c = c;
        this.count=count;
    }
}
public class HappyStringOptimise {
    public static String find(int a,int b,int c) {
        PriorityQueue<CharacterCount> pq = new PriorityQueue<>((ele1, ele2) -> Integer.compare(ele2.count, ele1.count
        ));
        if (a > 0) {
            pq.add(new CharacterCount('a',a));
        }
        if(b>0){
            pq.add(new CharacterCount('b',b));
        }
        if(c>0){
            pq.add(new CharacterCount('c',c));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            CharacterCount maxCount = pq.poll();
            int count = maxCount.count;
            char ch = maxCount.c;
           if(sb.length()>=2 && sb.charAt(sb.length()-1)==ch && sb.charAt(sb.length()-2)==ch){
               if(pq.isEmpty()){
                   break;
               }
               CharacterCount secondMax = pq.poll();
               int sCount = secondMax.count;
               char ch2 = secondMax.c;
               sb.append(ch2);
               sCount--;
               if(sCount>0){
                   pq.add(new CharacterCount(ch2,sCount));
               }
               pq.add(new CharacterCount(ch,count));
           }
           else {
               sb.append(ch);
               count--;
               if(count>0){
                   pq.add(new CharacterCount(ch,count));
               }
           }
        }
        return sb.toString();
    }
    public static void main(String [] args){
        System.out.println(find(1,1,7));
    }
}
