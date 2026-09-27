package TwoPointer;

public class ReverseStringUsingFunctions {
    public static String reverse(String str){
        //str = " hello world  "
        String trimStr = str.trim();
        //str = "hello world"
        String[] strArr = trimStr.split("\\s+");
        //strArr = [hello , world]
        int i=0;
        int j= strArr.length-1;
        while(i<j){
            String temp = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = temp;
            i++;
            j--;

        }
return String.join(" ",strArr);

    }
 public static void main(String [] args){
     String str = "  hello world  ";
     System.out.println(reverse(str));
 }
}
