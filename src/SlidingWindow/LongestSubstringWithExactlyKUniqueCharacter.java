package SlidingWindow;

import javax.xml.stream.events.Characters;
import java.util.HashMap;

public class LongestSubstringWithExactlyKUniqueCharacter {
//    Question: Longest Substring with Exactly K Unique Characters
//
//    Given a string s and an integer k,
//    find the length of the longest substring that
//    contains exactly k distinct (unique) characters.
//
//    If no such substring exists, return -1.
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
        String str = "aaabbcc";
        int found = find(str,2);
        System.out.println(found);

    }
}
