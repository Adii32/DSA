package FastSlowPointer;

public class LinkedLists {

        public ListNode head;

        public LinkedLists() {
            head = null;
        }

        public void add(int val) {

            ListNode newNode = new ListNode(val);

            if (head == null) {
                head = newNode;
                return;
            }

            ListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        public void print() {

            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }

        public static class ListNode {

            public int val;
            public ListNode next;

            public ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }
    }


