package TwoPointer;

public class PolindromString {
//  leetcode 125 :  A phrase is a palindrome if, after converting
//    all uppercase letters into lowercase letters and removing
//    all non-alphanumeric characters, it reads the same forward and
//    backward. Alphanumeric characters include letters and numbers.
    public static boolean find(String s){
      int i=0;
      int j=s.length()-1;
      while(i<j){
          char c1 = s.charAt(i);
          char c2 = s.charAt(j);
          if(!Character.isLetterOrDigit(c1)){
              i++;
              continue;
          }
          if(!Character.isLetterOrDigit(c2)){
              j--;
              continue;
          }
          else if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)){
              return false;
          }
          i++;
          j--;
      }
      return true;
    }
    public static void main(String [] args){
        String str = "l1e ve:l";
        boolean ans = find(str);
        System.out.println(ans);
    }
}
