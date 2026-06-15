package TwoPointer;

public class HappyNumber {
    public static int fun(int n){
        int sum=0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
    public static boolean checkHappy(int n){
        int fast=n;
        int slow=n;
        while(true){
            slow = fun(slow);
            fast = fun(fast);
            fast = fun(fast);

            if(slow == fast && slow != 1){
                return false;
            }

            if(fast == 1){
                return true;
            }
        }
    }
    public static void main(String [] args){
        int n = 100;
        boolean check = checkHappy(n);
        System.out.println(check);
    }
}
