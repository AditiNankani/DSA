/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main{
	
	public static char highestOccuringChar(String str) {
				          char string[] = str.toCharArray();  
                    char maxChar = str.charAt(0); 
                        
						  int i,j,max=0;
      for(i=0;i<string.length;i++){
            if (string[i] != '0') {
		  int freq=1;
		  for(j=i+1;j<string.length;j++){
			  if(string[i]==string[j]){
				  freq++;

				  string [j]='0';		}  }
		  
		  if(max<freq){
		  max = freq;  
				 maxChar=string[i];
		  }}}
		  return maxChar;
	  }
public static void main(String[] args) {
        String input = "abcdeapapqarr";
        System.out.println(highestOccuringChar(input));
    }
	}


