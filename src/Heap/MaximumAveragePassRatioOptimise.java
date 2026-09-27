package Heap;

import java.util.PriorityQueue;

class ClassDetails{
    double gain;
    int passes;
    int total;
    ClassDetails(double gain,int passes,int total){
        this.gain=gain;
        this.passes=passes;
        this.total=total;
    }

}
public class MaximumAveragePassRatioOptimise {
    public static double find(int arr[][],int extraStudent){
        PriorityQueue<ClassDetails> maxGain =new  PriorityQueue<ClassDetails>((a,b)->Double.compare(a.gain,b.gain));
        for(int i=0;i< arr.length;i++){
            int passes = arr[i][0];
            int total = arr[i][1];
            double gain = ((double)(passes+1)/(total+1))-((double)(passes)/(total));
            maxGain.add(new ClassDetails(gain,passes+1,total+1));
        }
        double totalGain = 0;
        for(int i=0;i<extraStudent;i++){
           ClassDetails maxG = maxGain.poll();
           totalGain = totalGain+maxG.gain;
           int passes = maxG.passes;
           int total = maxG.total;
           double gain = ((double)(passes+1)/(total+1))-((double)(passes)/(total));
           maxGain.add(new ClassDetails(gain,passes+1,total+1));
        }
        double res=0;
        for(int c[] : arr){
            res+=((double)c[0]/c[1]);
        }
        return res/ arr.length;
    }
    public static void main(String [] args){
        int arr[][] = {{1,2},{3,5},{2,2}};
        System.out.println(find(arr,1));
    }
}
