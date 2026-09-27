package Heap;

public class LargestNumberAfterDigitSwapsByParityBFA {
    public static int find(int num){
        char ch[] = Integer.toString(num).toCharArray();
        //65685
        //
        for(int i=0;i<ch.length;i++){
            int maxPos = i;
//54321

            for(int j=i+1;j<ch.length;j++){
                if(ch[j]>ch[maxPos] && (ch[i]-ch[j])%2==0){
                    maxPos=j;
                }
            }
            char c = ch[maxPos];
            ch[maxPos] = ch[i];
            ch[i] = c;
        }
        return Integer.parseInt(new String(ch));
    }
    public static void main(String [] args){
        int n = 12345;
        System.out.println(find(n));
    }
}
