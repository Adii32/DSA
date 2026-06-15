package TwoPointer;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class CycleDetectionInLinkedList {
    Node head = null;
    Node tail = null;
    int size=0;
    public  void insertAtFirst(int value){
        Node temp = new Node(value);
        if(head==null){
            head=tail=temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void insertAtMiddle(int value,int indx){
        if(indx==0) {
            insertAtFirst(value);
            return;
        }
        if(indx==size){
            insertAtLast(value);
            return;
        }
        Node n = new Node(value);
        Node temp = head;
        for(int i=1;i<=indx-1;i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
        size++;
    }
    public void insertAtLast(int value){
        Node n = new Node(value);
        if(head==null){
            head=tail=n;
        }
        else {
            tail.next = n;
            tail = n;
        }
        size++;
    }
    public int get(int indx){
        Node temp = head;
        for(int i=1;i<=indx-1;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public void delete(int indx){
        if(indx==0){
            head = head.next;
            if(head==null) tail=null;
            size--;
            return;
        }
        Node temp = head;
        for(int i=1;i<=indx-1;i++){
            temp = temp.next;
        }
        temp.next= temp.next.next;
        if(temp.next==null){
            tail = temp;
        }
        size--;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }
        public boolean detectCycle(){
           Node slow = head;
           Node fast = head;
           while(fast!=null && fast.next!=null){
               slow = slow.next;
               fast = fast.next.next;
               if(slow==fast) return true;
           }
           return false;
        }

    public static void main(String [] str){
        CycleDetectionInLinkedList ll = new CycleDetectionInLinkedList();
        ll.insertAtFirst(1);
        ll.insertAtMiddle(2,1);
        ll.insertAtLast(3);
        ll.insertAtLast(1);
   ll.tail.next = ll.head.next;

        System.out.println(ll.detectCycle());
//        ll.display();

    }
}
