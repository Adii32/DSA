package TwoPointer;

public class AppendStringToMakeStringSubsequance {
    public static int find(String str,String str2){
        int i=0;
        int j=0;
        while(i<str.length() && j<str2.length()){
            if(str.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            i++;
        }
        return (str2.length()-1)-j;
    }
    public static void main(String [] args){
        String str = "coaching";
        String str2 = "coding";
        System.out.println(find(str,str2));
    }
}
