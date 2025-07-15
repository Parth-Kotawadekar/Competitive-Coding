/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        if(head==null || head.next==null)
            return;
        Node slow=head,fast=head;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null)//no loop
                return;
            if(slow==fast)//loop detected
                break;
        }
        if(fast==null || fast.next==null)
            return;
        //slow==fast
        slow=head;
        if(slow!=fast)
        {
           //move slow and fast one step ahead
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
        return; 
        }
        else
        {
            //slow and fast met at first position
            while(fast.next!=slow)
            {
                fast=fast.next;
            }
            fast.next=null;
            return;
        }
    }
}