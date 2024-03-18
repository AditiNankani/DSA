/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}
/* Name of the class has to be "Main" only if the class is public. */
class Main
{  Node head;

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

Node rotList(Node h,int k){
    Node tail=h;
    int length=1;
    while(tail.next!=null){
        tail=tail.next;
        length++;
    }

    Node temp=h;
    for(int i=0;i<length-k-1;i++){
        temp=temp.next;
    }

    Node newHead=temp.next;
    temp.next=null;
    tail.next=h;

    return newHead;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        Main m=new Main();
        String s=sc.nextLine();
        String arr[]=s.split("\\s+");
        for(int i=0;i<arr.length;i++){
            m.add(Integer.parseInt(arr[i]));
        }

       int a=sc.nextInt();
        int k=2;
        Node current=m.rotList(m.head,k);
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
	}
}
