class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
public class removeNthNodeFromEnd{
    public static Node removeNthFromEnd(Node head, int n){
        Node dummy = new Node(0);
        dummy.next=head;
        Node curr=dummy;
        int len=0;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        len=len-n;
        curr=dummy;
        while(len>0){
            len--;
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return dummy.next;
    }
}
