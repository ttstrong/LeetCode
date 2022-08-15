package com.sgu.leetcode.top100.困难;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/8/14 15:22
 */
public class LeetCode23 {
    //合并K个升序链表(困难)
    //给你一个链表数组，每个链表都已经按升序排列。
    //请你将所有链表合并到一个升序链表中，返回合并后的链表。

    /**
     * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
     * 输出：[1,1,2,3,4,4,5,6]
     * 解释：链表数组如下：
     * [
     * 1->4->5,
     * 1->3->4,
     * 2->6
     * ]
     * 将它们合并到一个有序链表中得到。
     * 1->1->2->3->4->4->5->6
     *
     * @param lists
     * @return
     */
    //顺序法
//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode head=null;
//        for (ListNode list : lists) {
//            head=mergeTwo(head,list);
//        }
//        return head;
//    }
//
//    public ListNode mergeTwo(ListNode a, ListNode b) {
//        if (a == null || b == null) {
//            return a != null ? a : b;
//        }
//        ListNode head = new ListNode(0);
//        ListNode tail = head, aPtr = a, bPtr = b;
//        while (aPtr != null && bPtr != null) {
//            if (aPtr.val < bPtr.val) {
//                tail.next = aPtr;
//                aPtr = aPtr.next;
//            } else {
//                tail.next = bPtr;
//                bPtr = bPtr.next;
//            }
//            tail = tail.next;
//        }
//        tail.next = (aPtr != null ? aPtr : bPtr);
//        return head.next;

    //分治法
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return head.next;
    }
}
