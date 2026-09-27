package Heap;

public class MaximumAveragePassRatioBFA {
    //T:O(K.n) S:O(1)
    public static double find(int arr[][],int extraStudent){
        for(int i=0;i<arr.length;i++){
            int maxGainInd=-1;
            double maxGain =0;
            for(int j=0;j<extraStudent;j++){
                int passes = arr[j][0];
                int total = arr[j][1];
                double gain = ((double) (passes+1)/(total+1))-((double)(passes)/(total));
                if(maxGainInd==-1){
                    maxGainInd=j;
                    maxGain=gain;
                    continue;
                }
                else {
                    if(gain>maxGain){
                        maxGain=gain;
                        maxGainInd=j;
                    }
                }
            }
            arr[maxGainInd][0] = arr[maxGainInd][0]+1;
            arr[maxGainInd][1] = arr[maxGainInd][1]+1;
        }
        double res=0;
        for(int c[] : arr){
             res += ((double) c[0]/c[1]);
        }
        return res/arr.length;
    }
    public static void main(String [] args){
int arr[][] = {{1,2},{3,5},{2,2}};
System.out.println(find(arr,1));
    }
}
