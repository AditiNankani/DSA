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
{Node head;

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

Node reverse(Node h,int k){
    Node current=h,prev=null,next=null;
    int cnt=0;
    while(cnt<k && current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
        cnt++;
    }

    if(next!=null){
        h.next=reverse(next,k);
    }
    return prev;
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
    int k=sc.nextInt();
    Node current=m.reverse(m.head,k);
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
	}
}
