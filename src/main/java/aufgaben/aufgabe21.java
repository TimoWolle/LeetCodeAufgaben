package aufgaben;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class aufgabe21 {
    public static void main(String[] args) {
        System.out.println(mergeTwoLists(new ListNode(4), new ListNode(5)));
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> alist1 = new ArrayList<Integer>();
        ArrayList<Integer> alist2 = new ArrayList<Integer>();

        while (list1 != null) {
            alist1.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            alist2.add(list2.val);
            list2 = list2.next;
        }

        alist1.addAll(alist2);

        Collections.sort(alist1);

        ListNode head = null;
        ListNode current = null;

        for (int i = 0; i < alist1.size(); i++) {
            if (head == null) {
                head = new ListNode(alist1.get(i));
                current = head;
            } else {
                current.next = new ListNode(alist1.get(i));
                current = current.next;
            }
        }
        return head;
    }
}
