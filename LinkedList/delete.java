class Node{
  int data;
  Node next;
Node(int data){
  this.data=data;
  this.next=null;}
}

class Solution{

  //at head
  public void deleteHead(){
    if(head!=null){
      head=head.next;
    }
    else{
      return;   //list is emoty
    }
  }


//delete at specific index
public void deleteAtIndex(int index){
  if(index<0){
    return;     //out of bounds
  }
  if(index==0){
    deleteHead();
    return;
  }
Node current=head;
  for(int i=0;i<index-1;i++){
    if(current==null){
      return;}
    current=current.next;
  }
if(current.next!=null){
  current.next=current.next.next;
}
}




//delete by value
  public void deleteByValue(int data){
    if(head==null){
      return;
    }
    if(head.data==data){
      head=head.next;
      return;
    }
    Node current=head;
    while(current.next!=null && current.next.data!=data){
      current=current.next;
    }
    if(current.next!=null){
      current.next=current.next.next;
    }
  }





  //delete by value when head and prev are not know
    public void deleteNode(ListNode node) {
         node.val=node.next.val;
         node.next=node.next.next;
}



  //delete at tail
  public void deleteTail(){
    if(head==null){
      return;
    }
    if(head.next==null){
      head=null;
      return;
    }
Node current=head;
  while(current.next.next!=null){
    current=current.next;
  }
    current.next=null;
  }
}



  
    
  
