/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Stacks{
    Stack<Integer> s1=new Stack();
    Stack<Integer> s2=new Stack();
    void enqueue(int n){
        if(s1.isEmpty()){
            s1.push(n);
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(n);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
    }

    int dequeue(){
        if(!s1.isEmpty()){
            return s1.pop();
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
        Stacks s=new Stacks();
        ArrayList<Integer> a1=new ArrayList();
        int t=sc.nextInt();
        while(t>0){
            int q=sc.nextInt();
            if(q==1){
                s.enqueue(sc.nextInt());
            }else if(q==2){
                a1.add(s.dequeue());
            }
            t--;
        }
        for(int ele:a1){
            System.out.println(ele+" ");
        }
	}
}
