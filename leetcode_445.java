import java.util.List;

public class leetcode_445 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            while(current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            return prev;
        }
        public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
            l1 = reverseList(l1);
            l2 = reverseList(l2);
            ListNode result = new ListNode(0);
            ListNode ans = result;
            ListNode temp1=l1,temp2=l2;
            int temp = 0;
            int carry = 0;
            while(temp1 != null && temp2 != null) {
                temp = temp1.val + temp2.val;
                if(carry == 0) {
                    if (temp > 9) {
                        carry = 1;
                        result.next = new ListNode(temp % 10);
                    } else {
                        result.next = new ListNode(temp);
                    }
                    result = result.next;
                } else {
                    if(temp < 9) {
                        temp++;
                        result.next = new ListNode(temp);
                        carry = 0;
                    } else {
                        temp += carry;
                        result.next = new ListNode(temp % 10);
                    }
                    result = result.next;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            if(temp1 != null) {
                while(temp1 != null) {
                    if (carry == 0) result.next = new ListNode(temp1.val);
                    else {
                        temp = temp1.val + carry;
                        if (temp > 9) {
                            result.next = new ListNode(temp % 10);
                        } else {
                            result.next = new ListNode(temp);
                            carry = 0;
                        }
                    }
                    result = result.next;
                    temp1 = temp1.next;
                }
            }
            if(temp2 != null) {
                while(temp2 != null) {
                    if (carry == 0) result.next = new ListNode(temp2.val);
                    else {
                        temp = temp2.val + carry;
                        if(temp > 9) {
                            result.next = new ListNode(temp % 10);
                        } else {
                            result.next = new ListNode(temp);
                            carry = 0;
                        }
                    }
                    result = result.next;
                    temp2 = temp2.next;
                }
            }
            if(carry == 1) {
                result.next = new ListNode(carry);
            }
            ans = reverseList(ans.next);
            return ans;
        }
    }
}
