package TwoPointer;

public class RemoveNthNodeFromLL {

    // ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Add node at the end
    static ListNode add(ListNode head, int val) {

        ListNode newNode = new ListNode(val);

        if (head == null) {
            return newNode;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Print linked list
    static void print(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Remove Nth node from end
    public static ListNode removeNthNode(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Find length
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // Position from beginning
        int delete = len - n + 1;

        ListNode prev = dummy;
        int i = 0;

        while (i < delete - 1) {
            prev = prev.next;
            i++;
        }

        // Delete node
        prev.next = prev.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = null;

        head = add(head, 1);
        head = add(head, 2);
        head = add(head, 3);
        head = add(head, 4);
        head = add(head, 5);

        System.out.println("Before:");
        print(head);

        int n = 2;

        head = removeNthNode(head, n);

        System.out.println("After:");
        print(head);
    }
}