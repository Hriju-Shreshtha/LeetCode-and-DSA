/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode res = temp;
        int carry = 0;
        while (l1!= null && l2!= null) {
            int sum = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            temp.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            // temp.next = new ListNode(); 
            temp = temp.next;
        }
        while (l1!= null) {
            int sum = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            temp.next = new ListNode(sum);
            l1 = l1.next;
            // temp.next = new ListNode();
            temp = temp.next;
        }
        while (l2!= null) {
            int sum = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            temp.next = new ListNode(sum);
            l2 = l2.next;
            // temp.next = new ListNode();
            temp = temp.next;
        }
        if (carry!=0)
        temp.next=new ListNode(carry);
        return res.next;
    }
}

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode();
//         ListNode res = dummy;
//         int total = 0, carry = 0;

//         while (l1 != null || l2 != null || carry != 0) {
//             total = carry;

//             if (l1 != null) {
//                 total += l1.val;
//                 l1 = l1.next;
//             }
//             if (l2 != null) {
//                 total += l2.val;
//                 l2 = l2.next;
//             }

//             int num = total % 10;
//             carry = total / 10;
//             dummy.next = new ListNode(num);
//             dummy = dummy.next;
//         }

//         return res.next;        
//     }
// }