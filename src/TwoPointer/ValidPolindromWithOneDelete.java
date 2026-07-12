package TwoPointer;

public class ValidPolindromWithOneDelete {
    public static boolean check(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean find(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return check(i,j-1,s) || check(i+1,j,s);
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String [] args){
        String str = "abc";
        boolean ans = find(str);
        System.out.println(ans);
    }

}
