package ca.ematos.leetcode.pointers;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(val);
        ListNode node = next;
        while(node !=null){
            sb.append(", " + node.val);
            node = node.next;
        }
        return sb.toString();
    }
}