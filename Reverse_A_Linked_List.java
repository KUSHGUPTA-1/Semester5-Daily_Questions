import java.util.*;
public class Reverse_A_Linked_List {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    linkedlist head;
    static class linkedlist {
        int data;
        linkedlist next;

        linkedlist(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    //TC:O(n) 
    //SC:O(1)
}
