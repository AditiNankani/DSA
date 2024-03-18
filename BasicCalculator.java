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
        Stack<Character> operators=new Stack<>();
        Stack<Integer> operands=new Stack<>();
        String ip=sc.nextLine();
        for(int i=0;i<ip.length();i++){
            char c=ip.charAt(i);
            if(Character.isDigit(c)){
                int num=c-'0';
                while(i+1<ip.length() && Character.isDigit(ip.charAt(i+1))){
                      num=num*10+(ip.charAt(i+1)-'0');
                      i++;
                }
                operands.push(num);
            }
            else if(c=='+' || c=='-' || c=='/' || c=='*'){
                while(!operators.isEmpty() && precedence(c)<=precedence(operators.peek())){
                        evaluate(operands,operators);
                }
                operators.push(c);
            }
        }
       while(!operators.isEmpty()){
           evaluate(operands,operators);
       }
       System.out.println(operands.pop());
	}

    public static int precedence(char c){
        if(c=='+' || c=='-'){
            return 1;
        }else if(c=='/' || c=='*'){
            return 2;
        }else{
            return 0;
        }
    }

    public static void evaluate(Stack<Integer>operands,Stack<Character> operators){
        int b=operands.pop();
        int a=operands.pop();
        char op=operators.pop();
        int res;
        if(op=='+'){
            res=a+b;
        }else if(op=='-'){
            res=a-b;
        }else if(op=='/'){
            res=a/b;
        }else{
            res=a*b;
        }
        operands.push(res);
    }
}
