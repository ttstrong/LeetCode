package com.sgu.leetcode.jzoffer;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author T-T强
 * @Date 2022/7/13 10:43
 */
public class JZLeetCode35 {
//    请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，
//    每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
//    输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//    输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
        class Node {
            int val;
            Node next, random;
            public Node(int val) {
                this.val = val;
                this.next = null;
                this.random = null;
            }
        }
        public Node copyRandomList(Node head) {
//            if (head==null){
//                return null;
//            }
//            Node cur = head;
//            Node dum = new Node(0), pre = dum;
//            while(cur != null) {
//                Node node = new Node(cur.val); // 复制节点 cur
//                pre.next = node;               // 新链表的 前驱节点 -> 当前节点
//                // pre.random = "???";         // 新链表的 「 前驱节点 -> 当前节点 」 无法确定
//                cur = cur.next;                // 遍历下一节点
//                pre = node;                    // 保存当前新节点
//            }
//            return dum.next;
            if(head == null) {
                return null;
            }
            Node cur = head;
            Map<Node, Node> map = new HashMap<>();
            // 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
            while(cur != null) {
                map.put(cur, new Node(cur.val));
                cur = cur.next;
            }
            cur = head;
            // 4. 构建新链表的 next 和 random 指向
            while(cur != null) {
                map.get(cur).next = map.get(cur.next);
                map.get(cur).random = map.get(cur.random);
                cur = cur.next;
            }
            // 5. 返回新链表的头节点
            return map.get(head);
        }


}
