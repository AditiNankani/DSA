/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

    public static List<String> genParent(int n){
        List<String> validAns=new ArrayList<>();
        char[] currString=new char[2*n];
        recurse(n,n,0,currString,validAns);
        return validAns;
    }

    public static void recurse(int fwd,int bwd,int currIndex,char[] currString,List<String> validAns){
        if(fwd==0 && bwd==0){
            validAns.add(new String(currString));
            return;
        }

        if(fwd>0){
            currString[currIndex]='(';
            recurse(fwd-1,bwd,currIndex+1,currString,validAns);
        }

        if(bwd>0 && fwd<bwd){
            currString[currIndex]=')';
            recurse(fwd,bwd-1,currIndex+1,currString,validAns);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> res=genParent(n);
        for(String s:res){
            System.out.println(s);
        }
	}
}
