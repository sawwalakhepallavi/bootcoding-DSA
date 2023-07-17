package com.bootcoding.likedlist;

public class DuplicateNode {
    public  Node addNode(){
        Node firstNode=new Node(1);
        Node secondNode=new Node(2);
        Node thirdNode=new Node(3);
        Node forthNode=new Node(6);
        Node fifthNode=new Node(4);
        Node sixthNode=new Node(5);
        Node seventhNode=new Node(6);

        Node head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=fifthNode;
        fifthNode.next=sixthNode;
        sixthNode.next=seventhNode;
        seventhNode.next=null;

        return head;
    }

    public Node removeElements(Node head, int val) {
        Node dummy=new Node(-1);
        dummy.next=head;
        Node temp=dummy;
        while(temp!=null){
            if(temp.next.data==val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
    public void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        DuplicateNode duplicateNode=new DuplicateNode();
//       Node head= addNode();-------when static use
        Node head=duplicateNode.addNode();
       Node s = duplicateNode.removeElements(head,6);
        duplicateNode.print(s);
    }
}
