package Heap;

public class MaximumAveragePassRation {
    public static double find(int extraStudent,int classes[][]){
        for(int i=0;i<extraStudent;i++){
            int maxInd = -1;
            double maxGain = 0;
            for(int j=0;j<classes.length;j++){
                int passes = classes[j][0];
                int total = classes[j][1];
             double gain = ((double)(passes+1)/(total+1))-((double)(passes/total));
             if(maxInd==-1){
                 maxInd=j;
                 maxGain = gain;
                 continue;
             }
             if(maxGain<gain){
                 maxInd = j;
                 maxGain = gain;
             }
            }
            classes[maxInd][0] = classes[maxInd][0]+1;
            classes[maxInd][1] = classes[maxInd][1]+1;
         }
        double res=0;
        for(int c[] : classes){
         res+=((double) c[0]/c[1]);
        }
        return res/classes.length;
    }
    public static void main(String [] args){
        int classes[][] = {{1,2},{3,5},{2,2}};
        double ans = find(2,classes);
        System.out.println(ans);
    }
}
