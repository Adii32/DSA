package TwoPointer;

public class ValidWordAbbrev {
    public static boolean find(String str1,String str2){
      int i=0;
      int j=0;
        while(i<str1.length()){
            char c_i = str1.charAt(i);
            char c_j = str2.charAt(j);
            if(Character.isDigit(c_j)){
                if(c_j=='0'){
                 return false;
                }
                String curr = "";
                while(j<str2.length() && Character.isDigit(str2.charAt(j))){
                   curr+=str2.charAt(j);
                   j++;
                }
                int val = Integer.parseInt(curr);
                i+=val;
            }
            else {
                if(c_i!=c_j){
                    return false;
                }
                i++;
                j++;
            }
        }
        return i==str1.length() && j==str2.length();
    }
    public static void main(String [] args){
        String str = "str";
        String str2 = "s1r";
        System.out.println(find(str,str2));
    }
}
