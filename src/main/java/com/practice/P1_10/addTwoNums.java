package com.practice.P1_10;

import com.practice.dataStructure.ListNode;

import java.util.Objects;

public class addTwoNums {
    /*
            2、两数之和
      给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
      并且它们的每个节点只能存储 一位 数字。如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
      您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

     */

    ListNode<Integer> addTwoNumsSimple(ListNode<Integer> l1, ListNode<Integer> l2){

        ListNode<Integer> res = new ListNode<Integer>(0);
        ListNode<Integer> cur = res,q = l1,p = l2;
        int carry = 0;

        while (Objects.nonNull(l1)||Objects.nonNull(l2)){
            int a = q == null?0:q.getVal();
            int b = p == null?0:p.getVal();

            cur.setNext(new ListNode<>((a+b+carry)%10));
            carry = (a+b+carry)/10;

            cur = cur.getNext();
            q = Objects.isNull(q.getNext())?null:q.getNext();
            p = Objects.isNull(p.getNext())?null:q.getNext();

        }

        if (carry > 0){
            cur.setNext(new ListNode<>(carry));
        }
        return res.getNext();
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(9);
        ListNode<Integer> l2 = new ListNode<>(2);
        addTwoNums a = new addTwoNums();
        System.out.println(a.addTwoNumsSimple(l1,l2));
    }
}
