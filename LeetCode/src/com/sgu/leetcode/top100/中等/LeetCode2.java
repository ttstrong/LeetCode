package com.sgu.leetcode.top100.中等;

import com.sgu.leetcode.ListNode;

/**
 * @Author T-T强
 * @Date 2022/8/7 16:34
 */
public class LeetCode2 {
    /*
    两数相加
    给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
    请你将两个数相加，并以相同形式返回一个表示和的链表。
    你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //定义一个新联表伪指针，用来指向头指针，返回结果
        ListNode prev = new ListNode(0);
        //定义一个进位数的指针，用来存储当两数之和大于10的时候，
        int carry = 0;
        //定义一个可移动的指针，用来指向存储两个数之和的位置
        ListNode cur = prev;
        //当l1 不等于null或l2 不等于空时，就进入循环
        while(l1!=null || l2!=null){
            //如果l1 不等于null时，就取他的值，等于null时，就赋值0，保持两个链表具有相同的位数
            int x= l1 !=null ? l1.val : 0;
            int y = l2 !=null ? l2.val : 0;
            //将两个链表的值，进行相加，并加上进位数
            int sum = x + y + carry;
            //计算进位数
            carry = sum / 10;
            //计算两个数的和，此时排除超过10的请况（大于10，取余数）
            sum = sum % 10;
            //将求和数赋值给新链表的节点，
            //注意这个时候不能直接将sum赋值给cur.next = sum。这时候会报，类型不匹配。
            //所以这个时候要创一个新的节点，将值赋予节点
            cur.next = new ListNode(sum);
            //将新链表的节点后移
            cur = cur.next;
            //当链表l1不等于null的时候，将l1 的节点后移
            if(l1 !=null){
                l1 = l1.next;
            }
            //当链表l2 不等于null的时候，将l2的节点后移
            if(l2 !=null){
                l2 = l2.next;
            }
        }
        //如果最后两个数，相加的时候有进位数的时候，就将进位数，赋予链表的新节点。
        //两数相加最多小于20，所以的的值最大只能时1
        if(carry == 1){
            cur.next = new ListNode(carry);
        }
        //返回链表的头节点
        return prev.next;
    }
}
