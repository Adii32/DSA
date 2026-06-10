package SlidingWindow;

public class MinimumWindowSubstring {
    public static boolean fun(int have[],int need[]){
        for(int i=0;i<255;i++){
            if(have[i]<need[i]) return false;
        }
        return true;
    }
  public static String find(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        int have[] = new int[255];
        int need[] = new int[255];
        int start=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<str2.length();i++){
            need[str2.charAt(i)]++;
        }
        int low=0;
        for(int high=0;high<str1.length();high++){
            have[str1.charAt(high)]++;
            while(fun(have,need)){
             int len = high-low+1;
              if(len<min){
                  min = len;
                  start=low;
              }
              have[str1.charAt(low)]--;
              low++;
            }
        }
        return min==Integer.MAX_VALUE ? "" : str1.substring(start,start+min);
  }
    public static void main(String [] args){
        String str1 = "abcdajgkabc";
        String str2 ="abc";
        String st = find(str1,str2);
        System.out.println(st);
    }
}
