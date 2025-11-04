import java.util.*;
public class Sort_List {
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        // Step 1: Extract values into ArrayList
        List<Integer> values=new ArrayList<>();
        ListNode temp = head;
        while(temp!=null) {
            values.add(temp.val);
            temp=temp.next;
        }
        // Step 2: Sort using Collections.sort()
        Collections.sort(values);
        // Step 3: Build sorted linked list
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int val:values){
            curr.next=new ListNode(val);
            curr=curr.next;
        }
        return dummy.next;
        //TC->O(n log n).
        //SC->O(n).
    }
}
