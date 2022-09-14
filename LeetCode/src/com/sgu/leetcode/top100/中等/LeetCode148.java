package com.sgu.leetcode.top100.中等;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/9/14 9:22
 */
public class LeetCode148 {
    //排序链表

    /**
     * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
     * 输入：head = [4,2,1,3]
     * 输出：[1,2,3,4]
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left !=null ? left:right;
        return res.next;
    }
}
