package ca.ematos.leetcode.pointers;

import java.util.List;

public class RemoveNthNodeFromEndList {

    public static void main(String[] args){
        ListNode _node5 = new ListNode(5);
        ListNode _node4 = new ListNode(4, _node5);
        ListNode _node3 = new ListNode(3, _node4);
        ListNode _node2 = new ListNode(2, _node3);
        ListNode _node1 = new ListNode(1, _node2);

        System.out.println(removeNthFromEnd(_node1, 2));

        _node1 = new ListNode(1);
        System.out.println(removeNthFromEnd(_node1, 1));

         _node2 = new ListNode(2, null);
        _node1 = new ListNode(1, _node2);
        System.out.println(removeNthFromEnd(_node1, 1));

        System.out.println(removeNthFromEnd(_node1, 2));

        _node3 = new ListNode(3, null);
        _node2 = new ListNode(2, _node3);
        _node1 = new ListNode(1, _node2);
        System.out.println(removeNthFromEnd(_node1, 2));

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null){
            return null;
        }
        ListNode node = head.next;
        int count = 1;

        while (node != null){
            node = node.next;
            count++;
        }

        if (count == n){
            return head.next;
        }

        int step = count - n;

        count = 1;

        ListNode content = new ListNode(head.val);
        ListNode contentCopy = content;

        ListNode current = head;
        while(current != null){
            if (count == step){
                current = current.next;
                if (current == null){
                    break;
                }
            }

            current = current.next;

            if (current == null) {
                break;
            }

            content.next = new ListNode(current.val);
            content = content.next;

            count++;
        }

        return contentCopy;
    }
}
