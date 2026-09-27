package FastSlowPointer;

public class DetectLengthOfLoop {

//        public int lengthOfLoop(Node head) {
//
//
//            Node slow = head;
//            Node fast = head;

            // Detect cycle
//            while (fast != null && fast.next != null) {
//
//                slow = slow.next;
//                fast = fast.next.next;
//
//                if (slow == fast) {
//                    break;
//                }
//            }

            // No cycle
//            if (fast == null || fast.next == null) {
//                return 0;
//            }

            // Find starting point of cycle
//            Node n1 = head;
//            Node n2 = slow;
//
//            while (n1 != n2) {
//                n1 = n1.next;
//                n2 = n2.next;
//            }

            // Find length of cycle
//            int len = 0;
//            Node curr = n1;
//
//            do {
//                curr = curr.next;
//                len++;
//            } while (curr != n1);
//
//            return len;
//        }
//


}
