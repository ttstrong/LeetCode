package com.sgu.leetcode.top100.中等;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/8/13 10:08
 */
public class LeetCode19 {
    //删除链表的倒数第 N 个结点
    //给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
    //输入：head = [1,2,3,4,5], n = 2
    //输出：[1,2,3,5]
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        //因为头节点有可能被删掉，所以先存起来
        pre.next = head;
        ListNode fast=pre,slow=pre;
        if (head.next==null) return null;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return pre.next;
    }
}
