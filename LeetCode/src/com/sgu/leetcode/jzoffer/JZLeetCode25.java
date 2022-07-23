package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/7/23 10:48
 */
public class JZLeetCode25 {
    //同leetcode21
    //合并两个排序的链表
    //输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。

    //递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1==null) return l2;
//        if (l2==null) return l1;
//        if (l1.val<= l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }
//        else{
//            l2.next=mergeTwoLists(l1, l2.next);
//            return l2;
//        }


        //双指针
        ListNode dum = new ListNode(0),cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur=cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return dum.next;
    }
}
