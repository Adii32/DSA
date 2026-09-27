package FastSlowPointer;

import DS.LinkedList;

public class Polindrome {
//    public static LinkedLists reverse(LinkedLists head){
//        LinkedLists curr = head;
//        LinkedLists prev = null;
//        while(curr!=null){
//            LinkedLists next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = prev;
//        }
//        return prev;
//    }
//    public static LinkedList check(LinkedLists head){
//        LinkedLists slow = head;
//        LinkedLists fast = head;
//        //1->2->2->1
//        //   s      f
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        LinkedLists n1 = reverse(slow);
//        LinkedLists n2 = head;
//        while(n1!=null && n2!=null){
//            int val1 = n1.val;
//            int val2 = n2.val;
//            if(n1!=n2){
//                return false;
//            }
//            n1 = n1.next;
//            n2 = n2.next;
//        }
//        return true;
//    }
}
