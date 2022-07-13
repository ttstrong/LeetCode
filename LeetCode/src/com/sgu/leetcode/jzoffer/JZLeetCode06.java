package com.sgu.leetcode.jzoffer;

import java.util.Stack;

/**
 * @Author T-T强
 * @Date 2022/7/13 8:35
 */
public class JZLeetCode06 {
//    输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
//    输入：head = [1,3,2]
//    输出：[2,3,1]
public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack=new Stack<ListNode>();
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        int size=stack.size();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=stack.pop().val;
        }
        return arr;
    }
}
