package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    public static boolean find(String str,Map<Character,Character> map){
        int i=0;
        int j= str.length()-1;
        while(i<=j){
            char left = str.charAt(i);
            char right = str.charAt(j);
            if(map.containsKey(left)){
                if(map.get(left)!=right){
              return false;
                }
                else {
                    i++;
                    j--;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String str = "988886";
        Map<Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('9','6');
        map.put('6','9');
        System.out.println(find(str,map));
    }
}
