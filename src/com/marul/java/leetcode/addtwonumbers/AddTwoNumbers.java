package com.marul.java.leetcode.addtwonumbers;

/**
 * @author iffybot
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        int carry = 0;

        while (l1!=null || l2!=null) {
            int x = (l1!=null) ? l1.value : 0;
            int y = (l2!=null) ? l2.value : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            result.next = new ListNode(sum % 10);
            result = result.next;

            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
        }

        if (carry > 0)
            result.next = new ListNode(carry);

        return result.next;
    }
}