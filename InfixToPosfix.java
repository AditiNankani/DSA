/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='/' || ch=='*';
    }

    public static int getPre(char operator){
        switch(operator){
            case '+':
            case '-':
                  return 1;
            case '*':
            case '/':
                    return 2;
            default:
                  return 0;
        }
    }

    public static String infixToPostfix(String infix){
        StringBuilder postfix=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char ch:infix.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
            postfix.append(ch);}
            else if(ch=='('){
               st.push(ch);
            }
            else if(ch==')'){
                 while(!st.isEmpty() && st.peek()!='('){
                     postfix.append(st.pop());
                 }
                 st.pop();
            }

            else if(isOperator(ch)){
                while(!st.isEmpty() && getPre(ch)<=getPre(st.peek())){
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            postfix.append(st.pop());
    }
    return postfix.toString();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        String p=infixToPostfix(i);
        System.out.println(p);
	}
}
