/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{     static String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

static void words(String s,String ans){
    if(s.length()==0){
        System.out.println(ans);
        return;
    }

    String key=keypad[s.charAt(0)-48];

    for(int i=0;i<key.length();i++){
        words(s.substring(1),ans+key.charAt(i));
    }
}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        words(s,"");
	}
}
