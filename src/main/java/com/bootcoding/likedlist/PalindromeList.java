package com.bootcoding.likedlist;

public class PalindromeList {
    public Node addNode(){
        Node firstNode=new Node(1);
        Node secondNode=new Node(2);
        Node thirdNode=new Node(6);
        Node forthNode=new Node(1);

        Node head=firstNode;
        firstNode.next= secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=null;

        return head;
    }
    public Node middleFind(Node head){
        Node fast=head;
        Node slow =head;
        while(fast!=null  ){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public void printL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

//    public Node isPalindrome(Node head){
//        return
//    }
    public static void main(String[] args) {
        PalindromeList palindromeList=new PalindromeList();
        Node head=palindromeList.addNode();
        Node t=palindromeList.middleFind(head);
        palindromeList.printL(t);
    }
}
