package TwoPointer;

public class ValidAbbrevation {
    public static boolean find(String str1,String abb){
        int i=0;
        int j=0;
        while(i<str1.length()){
            char c_i = str1.charAt(i);
            char c_j = abb.charAt(j);
            if(Character.isDigit(c_j)){
                if(c_j=='0'){
                    return false;
                }
                String curr="";
                while(j<abb.length() && Character.isDigit(c_j)){
                    curr+=c_j;
                    j++;
                }
                int value = Integer.parseInt(curr);
                i+=value;
            }
            else {
                if(c_i!=c_j){
                    return false;
                }
                i++;
                j++;
            }
        }
        return true;
    }
    public static void main(String [] args){
        String str1 = "abbbbbbbbbb";
        String abb = "a10b";
        System.out.println(find(str1,abb));

    }
}
