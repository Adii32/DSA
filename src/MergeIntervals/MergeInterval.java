package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class MergeInterval {
    public static int[][] merge(int arr[][]){
        List<int[]> list = new ArrayList<>();
        list.add(arr[1]);
        for(int i=1;i<arr.length;i++){
            int prev[] = list.get(list.size()-1);
            int curr[] = arr[i];
            if(curr[0]<=prev[1]){
                prev[0] = Math.min(curr[0],prev[0]);
                prev[1] = Math.max(curr[1],prev[1]);
            }
            else {
                list.add(arr[i]);
            }
        }
        int res[][] = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
         res[i] = list.get(i);
        }
        return res;
    }
    public static void main(String [] args){
int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
int res[][] = merge(arr);
for(int i=0;i<res.length;i++){
    System.out.print("{");
 for(int j=0;j<res[i].length;j++){
     System.out.print(arr[i][j]+",");
 }

 System.out.print("}");
}
    }
}
