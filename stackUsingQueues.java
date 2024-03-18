/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Queues{
    Queue<Integer> q1=new LinkedList();
    Queue<Integer> q2=new LinkedList();
    void push(int n){
        if(!q1.isEmpty()){
            q1.add(n);
        }else{
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
            q1.add(n);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }
    }
    int pop(){
        if(!q1.isEmpty()){
            return q1.poll();
        }
        return -1;
    }

}
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        Queues q=new Queues();
        ArrayList<Integer> a1=new ArrayList();
        int t=sc.nextInt();
        while(t>0){
            int qu=sc.nextInt();
            if(qu==1){
                q.push(sc.nextInt());
            }else if(qu==2){
                a1.add(q.pop());
            }
            t--;
        }
    for(int ele:a1){
        System.out.println(ele+" ");
    }
	}
}
