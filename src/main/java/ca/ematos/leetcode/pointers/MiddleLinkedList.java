package ca.ematos.leetcode.pointers;

public class MiddleLinkedList {
    public static void main(String[] args){

        ListNode _node5 = new ListNode(5);
        ListNode _node4 = new ListNode(4, _node5);
        ListNode _node3 = new ListNode(3, _node4);
        ListNode _node2 = new ListNode(2, _node3);
        ListNode _node1 = new ListNode(1, _node2);

        ListNode _node = _middleNode(_node1);

        ListNode _node6 = new ListNode(6);
        _node5.next = _node6;

        ListNode node = middleNode(_node1);

        System.out.println(node);

    }

    public static ListNode middleNode(ListNode head) {

        int count = middle(head);

        int mid = count / 2;

        for (int i = 0; i < mid; i++){
            head = head.next;
        }

        return head;
    }

    public static int middle(ListNode head) {
        if (head == null)
            return 0;

        if (head.next == null)
            return 1;

        return middle(head.next) + 1;
    }

    public static ListNode _middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
