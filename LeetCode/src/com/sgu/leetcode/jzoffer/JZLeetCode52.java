package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/7/23 11:15
 */
public class JZLeetCode52 {
    //两个链表的第一个公共节点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

//        ListNode pA = headA, pB = headB;
//        while (pA != pB) {
//            pA = pA == null ? headB : pA.next;
//            pB = pB == null ? headA : pB.next;
//        }
//        return pA;

        ListNode pa = headA, pb = headB;
        while (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }
}
