package SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           max = Math.max(max,arr[i]);
        }
    return max;
    }
    public static int find(String str,int k){
     int arr[] = new int[255];
     int res=-1;
     int low=0;
     for(int high=0;high<str.length();high++){
         arr[str.charAt(high)]++;
         int len = high-low+1;
         int maxCount = findMax(arr);
         int diff = len-maxCount;
         while(diff>k){
             arr[str.charAt(low)]--;
             low++;
             len = high-low+1;
             maxCount = findMax(arr);
             diff = len-maxCount;
         }
         res = Math.max(res,high-low+1);
     }
     return res;
    }
    public static void main(String [] args){
        String str = "abaaa";
        int found = find(str,1);
        System.out.println(found);
    }
}
