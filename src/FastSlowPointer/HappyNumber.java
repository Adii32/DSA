package FastSlowPointer;

import java.util.HashSet;

public class HappyNumber {
    public static int sumofSquareDigit(int n){
     int sum=0;
     while(n>0){
         int rem = n%10;
         sum+= (rem*rem);
         n = n/10;
     }
     return sum;
    }
    public static boolean find(int n){
        int slow=n;
        int fast = n;
        while(fast!=1){
            slow = sumofSquareDigit(slow);
            fast = sumofSquareDigit(sumofSquareDigit(fast));
            if(fast == 1) return true;
            if(slow==fast) return false;
        }
        return true;
    }
    public static void main(String [] args){
        int n = 19;
        System.out.println(find(n));
    }
}
