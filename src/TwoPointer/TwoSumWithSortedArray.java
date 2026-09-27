package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWithSortedArray {
    public static int[] find(int arr[],int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int lookingFor = target-arr[i];
            if(map.containsKey(lookingFor)){
                return new int[]{
                        i,map.get(lookingFor)
                };
            }
            map.put(arr[i],i);
        }
        return new int[]{
                -1,-1
        };
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5};
     int a[] = find(arr,7);
     for(int i=0;i<a.length;i++){
         System.out.println(a[i]);
     }
    }
}
