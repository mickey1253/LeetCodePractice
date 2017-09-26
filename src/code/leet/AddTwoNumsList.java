package code.leet;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mickey on 7/17/2016.
 */

class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
 }

public class AddTwoNumsList {

    public static void main(String[] args){

        //dataType[] arrayRefVar = {value0, value1, ..., valuek};

        List<ListNode> lst1 = new LinkedList<>();
        lst1.add(0, new ListNode(3));
        lst1.add(1, new ListNode(4));
        lst1.add(2, new ListNode(2));

        List<ListNode> lst2 = new LinkedList<>();
        lst2.add(0, new ListNode(4));
        lst2.add(1, new ListNode(6));
        lst2.add(2, new ListNode(5));
     //   lst2.add(3, new code.leet.ListNode(6));

        List<ListNode> lst3 = new LinkedList<>();
        lst3.add(0, addTwoNumbers(lst1.get(0), lst2.get(0)));
        lst3.add(1, addTwoNumbers(lst1.get(1), lst2.get(1)));
        lst3.add(2, addTwoNumbers(lst1.get(2), lst2.get(2)));
     //   lst3.add(3, addTwoNumbers(lst1.get(3), lst2.get(3)));

        for (ListNode lstNode: lst3 ) {

            System.out.print(lstNode.val + " ");

        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }



}
