class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node node=new Node(x);
        if(head==null){
            head=node;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
        Node current=head;
        while(current!=null){
            current = current.next;
        }
        return head;
    }
}
