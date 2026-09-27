package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {
    public static boolean find(Map<Character,Character> map,String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2){
                    return false;
                }
                else{
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
    public static void main(String[] args) {
        String str = "16091";
       Map<Character,Character> map = new HashMap<>();
       map.put('1','1');
       map.put('0','0');
       map.put('8','8');
       map.put('6','9');
       map.put('9','6');
System.out.print(find(map,str));
    }
}
