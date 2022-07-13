package com.sgu.leetcode.jzoffer;

import com.sgu.leetcode.ListNode;

import java.nio.file.LinkOption;
import java.util.List;
import java.util.Stack;

/**
 * @Author T-T强
 * @Date 2022/7/13 9:20
 */
public class JZLeetCode24 {
    //同LeetCode206
//    定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
//    输入: 1->2->3->4->5->NULL
//    输出: 5->4->3->2->1->NULL

    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> stack=new Stack<>();
//        ListNode code=new ListNode(-1);
//        if (head==null) {
//            return null;
//        }
//        while (head!=null){
//            stack.push(head);
//            head=head.next;
//        }
//        ListNode node = stack.pop();
//        ListNode dummy = node;
//        while (!stack.isEmpty()){
//            ListNode tempNode = stack.pop();
//            node.next = tempNode;
//            node = node.next;
//        }
//        node.next=null;
//        return dummy;

        ListNode cur = head, pre = null;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;

    }
}
