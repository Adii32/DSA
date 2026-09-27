package Heap;

public class HappyStringBFA {
    public static String find(int a,int b,int c){
     int c_a=0;
     int c_b=0;
     int c_c=0;
     StringBuilder sb = new StringBuilder();
     while(true){
         if(a>0 && ((a>=b && a>=c && c_a<2) || (c_b==2 && b>=a && a>=c) || (c_c==2 && c>=a && a>=b))){
             sb.append('a');
             c_a=c_a+1;
             c_b=0;
             c_c=0;
             a=a-1;
         }
         else if(b>0 && ((b>=a && b>=c && c_b<2) || (c_a==2 && a>=b && b>=c) || (c_c==2 && c>=b && b>=a))){
             sb.append('b');
             c_c=0;
             c_a=0;
             c_b=c_b+1;
             b=b-1;
         }
         else if(c>0 && ((c>=a && c>=b && c_c<2) || (c_a==2 && a>=c && c>=b) || (c_b==2 && b>=c && c>=a))){
             sb.append('c');
             c_c=c_c+1;
             c=c-1;
             c_a=0;
             c_b=0;
         }
         else {
             break;
         }
     }
     return sb.toString();
}
public static  void main(String [] args){
        System.out.println(find(1,1,7));
}

}
