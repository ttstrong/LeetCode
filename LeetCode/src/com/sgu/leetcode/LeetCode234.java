package com.sgu.leetcode;


import java.rmi.server.RMIClassLoader;
import java.util.List;
import java.util.Stack;

/**
 * @Author T-T强
 * @Date 2022/7/5 14:47
 */
public class LeetCode234 {

    //给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode tmp=head;
        Stack<Integer> stack=new Stack();
        while (tmp!=null){
            stack.push(tmp.val);
            tmp=tmp.next;
        }

        while (head!=null){
            if (head.val!=stack.pop()){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
