package PrefixSum;

public class FindAbbrevation {
    public static boolean find(String s,String s1){
        int i=0;
        int j=0;
        while(i<s.length() && j<s1.length()){
            char s_c = s.charAt(i);
            char s1_c = s1.charAt(j);
            if(Character.isDigit(s1_c)){
                if(s1_c=='0'){
                    return false;
                }
                int curr=0;
                while(j<s1.length() && Character.isDigit(s1.charAt(j))){
                    curr = curr*10+(s1.charAt(j)-'0');
                    j++;
                }
               i+=curr;

            }
            else {
                if(s_c!=s1_c){
                    return false;
                }
                i++;
                    j++;
            }
        }
        return i==s.length() && j==s1.length();
    }
    public static void main(String [] args){
        String a = "apple";
        String s1 = "a1p3e";
        boolean ans = find(a,s1);
        System.out.println(ans);
    }
}
