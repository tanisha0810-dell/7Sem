import java.util.*;
class Node{
    Node next;
    int data;
    Node(int val){
        data=val;
        next=null;
    }
}
public class add2Node {
    public static Node add(Node head, Node head1){
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry=0;
        while(head!=null || head1!=null || carry>0){
            int sum = carry;
            if(head!=null){
                sum+=head.data;
                head=head.next;
            }
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            curr.next=new Node(sum%10);
            curr=curr.next;
            carry=sum/10;
        }
        return dummy.next;
    }
}
