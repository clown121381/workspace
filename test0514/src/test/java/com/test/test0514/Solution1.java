package com.test.test0514;

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Solution1 {
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		
		
        ArrayList<Integer> li = new ArrayList<Integer>();
		while(listNode != null){
        	li.add(listNode.val);
        	listNode = listNode.next;
        }
		Collections.reverse(li);
		return li;
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		
		System.out.println(Solution1.printListFromTailToHead(l1));
		
	}
}