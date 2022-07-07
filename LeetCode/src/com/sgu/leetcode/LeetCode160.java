package com.sgu.leetcode;

/**
 * @Author T-T强
 * @Date 2022/7/7 9:44
 */
public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA=headA,pB=headB;
        while (pA!=pB){
            pA= pA==null?headB:pA.next;
            pB= pB==null?headA:pB.next;
        }
        return pA;
    }
}
