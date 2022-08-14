package com.sgu.leetcode.top100.简单;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/8/14 14:30
 */
public class LeetCode21 {
    //合并两个有序链表
    //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    //输入：l1 = [1,2,4], l2 = [1,3,4]
    //输出：[1,1,2,3,4,4]
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead=new ListNode(-1);
        ListNode prev=prehead;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                prev.next=l1;
                l1=l1.next;
            }else {
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        prev.next=l1 == null?l2:l1;
        return prehead.next;
    }
}
