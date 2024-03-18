/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Main
{            Node head;    
    void add(int d){
    Node n=new Node(d);
    if(head==null){
        head=n;
    }else{
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n;
    }
     }
Node middle(Node head){
    Node sp=head;
    Node fp=head;
    while(fp!=null && fp.next!=null){
        sp=sp.next;
        fp=fp.next.next;
    }
    return sp;
}

Node reverse(Node head){
    Node current=head,prev=null,next=null;
    while(current!=null){
         next=current.next;
         current.next=prev;
         prev=current;
         current=next;
    }
    return prev;
}
     void reorder(Node head){
         Node mid=middle(head);
        Node rev=reverse(mid.next);
        mid.next=null;
        Node f1=null;
        Node f2=null;
        Node c1=head;
        Node c2=rev;
        while(c1!=null && c2!=null){
            f1=c1.next;
            c1.next=c2;
            f2=c2.next;
            c2.next=f1;
            c1=f1;
            c2=f2;
        }
     }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Main m=new Main();
        String arr[]=s.split("\\s+");
        for(int i=0;i<arr.length;i++){
            m.add(Integer.parseInt(arr[i]));
        }
        m.reorder(m.head);
        Node current=m.head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
	}
}
