package TwoPointer;

public class PolindromString {
//  leetcode 125 :  A phrase is a palindrome if, after converting
//    all uppercase letters into lowercase letters and removing
//    all non-alphanumeric characters, it reads the same forward and
//    backward. Alphanumeric characters include letters and numbers.
    public static boolean find(String s){
        int i=0;
        int j = s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public static void main(String [] args){
        String str = "le ve:l";
        boolean ans = find(str);
        System.out.println(ans);
    }
}
