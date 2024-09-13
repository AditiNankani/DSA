//insert at head
class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
}

class Solution{
  Node head;
  public void insertHead(int data){
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
  }
}




//insert at Index
class Solution{
  public void insertAtIndex(int data,int index){
    if(index<0){
      return;}
    if(index==0){
      insertHead(data);
      return;
    }

  Node newNode=new Node(data);
    Node current=head;
    for(int i=0;i<index-1;i++){
      if(current==null){
        return;}
      current=current.next;
    }
    if(current==null){
      return;}
    else{
      newNode.next=current.next;
      current.next=newNode;
    }
  }
