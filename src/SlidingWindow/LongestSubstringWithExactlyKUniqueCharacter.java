package SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithExactlyKUniqueCharacter {
    public static int find(String str,int k){
      int low=0;
      int res=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int high=0;high<str.length();high++){
            map.put(str.charAt(high),map.getOrDefault(str.charAt(high),0)+1);
            while(map.size()>k){
char c = str.charAt(low);
map.put(c,map.get(c)-1);
if(map.get(c)==0) map.remove(c);
low++;
            }
            if(map.size()==k) res = Math.max(res,(high-low)+1);
        }
        return res;
    }
    public static void main(String[] args){
        String str = "aaabcaaa";
        int found = find(str,2);
        System.out.println(found);

    }
}
