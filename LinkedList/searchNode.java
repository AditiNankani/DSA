class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}

class Solution{
  static boolean SearchKey(int n,Node head,int key){
    Node current=head;
    while(curren!=null){
      if(current.data==key){
        return true;
      }
      current=current.next;
    }
    return false;
  }
}
