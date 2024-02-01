package com.kerwin.leetcode;

/**
 * @author yangjisheng
 */
public class RemoveSmallLeftNodes {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        head.next = removeNodes(head.next);
        if (head.next != null && head.val < head.next.val) {
            return head.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(2);
        node2.next = node3;
        ListNode node4 = new ListNode(12);
        node3.next = node4;
        ListNode node5 = new ListNode(1);
        node4.next = node5;
        ListNode node6 = new ListNode(8);
        node5.next = node6;

        ListNode res = new RemoveSmallLeftNodes().removeNodes(node1);
        System.out.println(1);
    }

}
