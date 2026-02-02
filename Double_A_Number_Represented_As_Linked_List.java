public class Double_A_Number_Represented_As_Linked_List {
    public ListNode doubleIt(ListNode head) {
        //Agar value 5 ya usse bdi hogi toh uski 2 se multiply krne ke baad carry hamesha 1 ka hi generate hoga.
        if(head.val>4){ 
            head=new ListNode(0,head); //Ek new node bna denge and 0 store kra denge us node pe.
        }
        ListNode curr=head; 
        while(curr.next!=null){
            if(curr.next.val>4){
                curr.val=(curr.val*2%10)+1; //Agar carry generate hota hai toh.
            }
            else{
                curr.val=curr.val*2%10; //Agar carry generate nhi hota.
            }
            curr=curr.next; //move to next node.
        }
        curr.val=curr.val*2%10; //Last node ke liye sirf double krna hai uske baad koi node nhi hai. 
        return head;
        //TC->O(N).
        //SC->O(1).
    }
}
