package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/7/22 8:30
 */
public class JZLeetCode18 {

    //删除链表的节点
    //给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
    //返回删除后的链表的头节点
    //输入: head = [4,5,1,9], val = 5
    //输出: [4,1,9]
    //解释: 给定你链表中值为5的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.


    public ListNode deleteNode(ListNode head, int val) {
        //双指针
//        if(head.val == val) return head.next;
//        ListNode pre = head, cur = head.next;
//        while(cur != null && cur.val != val) {
//            pre = cur;
//            cur = cur.next;
//        }
//        if(cur != null) pre.next = cur.next;
//        return head;


        //单指针
        if (head == null) return null;
        if (head.val==val) return head.next;
        ListNode cur=head;
        while (cur.next!=null && cur.next.val!=val)
            cur=cur.next;
        if (cur.next!=null)
            cur.next=cur.next.next;
        return head;
    }
}
