/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    void add(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=newNode;
}}
/* Name of the class has to be "Main" only if the class is public. */
class Sol
{
	  static Node merge(Node head1,Node head2){
		if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
   Node anshead;
        if(head1.data>head2.data){
            anshead=head2;
            head2=head2.next;
        }
        else{
            anshead=head1;
            head1=head1.next;
        }
        Node tempNode=anshead;
        

        while(head1!=null && head2!=null){
        if(head1.data>head2.data){
            tempNode.next=head2;
            head2=head2.next;
        }

        else{
            tempNode.next=head1;
            head1=head1.next;
        }
       tempNode=tempNode.next;
	}
if(head1!=null){
    tempNode.next=head1;
}
else if(head2!=null){
    tempNode.next=head2;
}
return anshead;}
}

public class Main{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n,m;
     n=sc.nextInt();
     LinkedList L1=new LinkedList();
     LinkedList L2=new LinkedList();
     for(int i=0;i<n;i++){
         L1.add(sc.nextInt());
     }
     m=sc.nextInt();
     for(int i=0;i<m;i++){
         L2.add(sc.nextInt());
     }

     Sol s=new Sol();
     Node head=s.merge(L1.head,L2.head);
     while(head!=null){
         System.out.println(head.data+" ");
         head=head.next;
     }
    }
}
