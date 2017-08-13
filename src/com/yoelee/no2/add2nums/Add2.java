package com.yoelee.no2.add2nums;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

 */
public class Add2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        computeOne(l1,l2,0,result);
        return  result;
    }

    private void computeOne(ListNode l1, ListNode l2, int from, ListNode sum){
        ListNode l1next = l1.next;
        ListNode l2next = l2.next;
        int v = l1.val + l2.val + from;
        int to = v / 10;
        sum.val = v % 10;
        if (l1.next == null && l2.next == null && to == 0){
            return;
        }
        if(l1.next == null){
            l1next = new ListNode(0);
        }
        if (l2.next == null){
            l2next = new ListNode(0);
        }
        sum.next = new ListNode(0);
        computeOne(l1next,l2next,to,sum.next);
    }

    public static void main(String [] args){
        int a = 15;
        System.out.println(a/10);
    }
}