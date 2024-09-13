class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

class Solution {
    public int getCount(Node head) {
            Node current=head;
            int cnt=0;
            while(current!=null){
                current=current.next;
                cnt++;
            }
            return cnt;
    }
}
