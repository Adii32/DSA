package TwoPointer;

public class ReverseString
{
public static String reverse(String str){
    String str2 = str.trim();
    int j=str2.length()-1;
    StringBuilder sb = new StringBuilder();

    while (j>=0){
        char c = str2.charAt(j);
        if(Character.isLetter(c)){
    StringBuilder temp = new StringBuilder();
            while(j>=0 && Character.isLetter(str2.charAt(j))){
               temp.append(str2.charAt(j));
                j--;

            }

            sb.append(temp.reverse());

        }
else if(Character.isSpaceChar(str2.charAt(j))){
    sb.append(" ");
    j--;
        }



    }

    return sb.toString();
}
    public static void main(String [] args){
        String str = "   hello world   ";
        System.out.print(reverse(str));
            }
}
