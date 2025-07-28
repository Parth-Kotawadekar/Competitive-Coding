/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        //Finding length of the list
        ListNode curr = head;
        int length = 1;  
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        
        //Computing rotations
        k = k % length;
        if (k == 0) return head; // No change needed
        
        // Making the list circular
        curr.next = head;

        //Finding new tail (length - k steps ahead)
        ListNode NewTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            NewTail = NewTail.next;
        }

        // Step 5: New head is after new tail
        ListNode newHead = NewTail.next;
        NewTail.next = null;

        return newHead;
    }
}