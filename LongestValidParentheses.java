/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        String s;
    s=sc.nextLine();
Stack<Integer> st=new Stack<>();
int max=0;
st.push(-1);

for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(c=='('){
        st.push(i);
    }
    else{
        st.pop();
        if(st.isEmpty()){
            st.push(i);
        }else{
            int len=i-st.peek();
            max=Math.max(max,len);
        }
    }
}
System.out.println(max);
	}
}
