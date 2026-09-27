package TwoPointer;

public class AppendStringToMakeStringSubsequance {
    public static int find(String str,String str2){
     int i=0;
     int j=0;
     while(i<str.length()){
         if(str.charAt(i)==str2.charAt(j)){
             j++;
         }
         i++;
     }
     return str2.length()-j;
    }
    public static void main(String [] args){
   String str = "coaching";
   String str2 = "coding";
   System.out.println(find(str,str2));
    }
}
