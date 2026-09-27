package TwoPointer;

public class ReverseStringOptimize {
    public static String reverse(String str){
//        int l=0;
//        int r=str.length()-1;
//        while(l<str.length()-1){
//            if(str.charAt(l)==' '){
//                l++;
//            }
//            else {
//                break;
//            }
//        }
//        while(r>=0){
//            if(str.charAt(r)==' '){
//                r--;
//            }
//            else {
//                break;
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        while(l<=r){
//            if(str.charAt(l)!=' '){
//                sb.append(str.charAt(l));
//                l++;
//            }
//            else if(str.charAt(l)==' '){
//                if(sb.charAt(sb.length()-1)==' '){
//                    l++;
//                }
//                else {
//                    sb.append(str.charAt(l));
//                }
//            }
//        }
//        int start=0;
//        int end = sb.length()-1;
//        while(start<end){
//            char t = sb.charAt(start);
//            sb.setCharAt(start,sb.charAt(end));
//            sb.setCharAt(end,t);
//            start++;
//            end--;
//        }
//        int i=0;
//        int j=0;
//        while(i<sb.length()-1){
//            while(j<sb.length() && sb.charAt(j)!=' '){
//                j++;
//            }
//            int p1=i;
//            int p2 = j-1;
//            while(p1<p2){
//                char temp = sb.charAt(p1);
//                sb.setCharAt(p1,sb.charAt(p2));
//                sb.setCharAt(p2,temp);
//                p1++;
//                p2--;
//            }
//            i=j+1;
//            j=i;
//        }
//    return sb.toString();
        int l=0;
        int r=str.length()-1;
        while(l<str.length()-1){
            if(str.charAt(l)==' '){
                l++;
            }
            else {
                break;
            }
        }
             while(r>0){
                 if(str.charAt(r)==' '){
                     r--;
                 }
                 else {
                     break;
                 }
             }
             StringBuilder sb = new StringBuilder();
             while(l<=r){
                 if(str.charAt(l)!=' '){
                    sb.append(str.charAt(l));
                    l++;
                 }
                 else if(str.charAt(l)==' '){
                     if(sb.charAt(sb.length()-1)==' '){
                         l++;
                     }
                     else {
                         sb.append(str.charAt(l));
                     }
                 }
             }
             int start=0;
             int end = sb.length()-1;
             while(start<end){
                 char c = sb.charAt(start);
                 sb.setCharAt(start,sb.charAt(end));
                 sb.setCharAt(end,c);
                 start++;
                 end--;
             }
             int i=0;
             int j=0;
             while(i<sb.length()-1){
                while(j<sb.length() && sb.charAt(j)!=' '){
                    j++;
                }
                int p1=i;
                int p2=j-1;
                while(p1<p2){
                    char c = sb.charAt(p1);
                    sb.setCharAt(p1, sb.charAt(p2));
                    sb.setCharAt(p2,c);
                    p1++;
                    p2--;
                }
                i=j+1;
                j=i;
             }
             return sb.toString();
    }

    public static void main(String [] args){
        String str = "  sky is  blue     ";
        System.out.print(reverse(str));
    }
}
