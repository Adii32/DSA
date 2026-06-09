package SlidingWindow;

import java.util.HashMap;

public class MaximumLengthOfWithoutRepeatingCharacterInString {
  public static int find(String str){
    int low=0;
    int res=-1;
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    for(int high=0;high<str.length();high++){
map.put(str.charAt(high),map.getOrDefault(str.charAt(high),0)+1);
int k = high-low+1;
while(map.size()<k){
    char c = str.charAt(low);
    map.put(c,map.get(c)-1);
    if(map.get(c)==0){
        map.remove(c);
    }
    low++;
    k = high-low+1;

}
res = Math.max(res,k);
    }
    return res;
  }
public static void main(String[] args){
String str = "aaabcaaa";
int found = find(str);
System.out.println(found);

}
}
