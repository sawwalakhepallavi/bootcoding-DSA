package com.bootcoding.likedlist;

public class ReverseLinkList {
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
    public void printl(Node head){
        System.out.println("before revers");
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node isRevers(Node head) {
        Node temp=head;
        Node prev=head;
        Node current=head.next;
        while (current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=null;
        head=prev;

//        if(temp==head){
//            return true;
//        }
        return head;
    }
    public void print(Node head){
        System.out.println("after revers");
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        ReverseLinkList reverseLinkList=new ReverseLinkList();
        Node head=reverseLinkList.addNode();
        reverseLinkList.printl(head);
        Node t=reverseLinkList.isRevers(head);
        reverseLinkList.print(t);
//        System.out.println(t);
    }
}
