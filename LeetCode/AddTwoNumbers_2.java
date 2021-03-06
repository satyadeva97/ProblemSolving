//public class AddTwoNumbers_2 {
//
//
//  public class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//      this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//      this.val = val;
//      this.next = next;
//    }
//  }
//
//  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    ListNode root = new ListNode(0);
//    ListNode ret = root;
//    int carry = 0;
//    while (l1 != null || l2 != null) {
//      int temp;
//      if (l2 == null) {
//        temp = l1.val + carry;
//        l1 = l1.next;
//      } else if (l1 == null) {
//        temp = l2.val + carry;
//        l2 = l2.next;
//      } else {
//        temp = l1.val + l2.val + carry;
//        l1 = l1.next;
//        l2 = l2.next;
//      }
//      carry = temp / 10;
//      root.next = new ListNode(temp % 10);
//      root = root.next;
//    }
//
//    if (carry != 0) {
//      root.next = new ListNode(carry);
//    }
//    return ret.next;
//
//  }
//}

//Small solution

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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode dummy = new ListNode(-1);
    ListNode current  = dummy;
    int carry = 0, sum;
    while (l1 != null || l2 != null) {
      int x = l1 == null ? 0 : l1.val;
      int y = l2 == null ? 0 : l2.val;
      sum = x + y + carry;
      carry = sum / 10;
      current.next = new ListNode(sum % 10);
      l1 = l1 != null ? l1.next : l1;
      l2 = l2 != null ? l2.next : l2;
      current = current.next;
    }

    if (carry != 0) {
      current.next = new ListNode(carry);
    }


    return dummy.next;


  }
}
