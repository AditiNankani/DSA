/* Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.
*/

class Solution {
    public int myAtoi(String s) {
        final int INT_MAX=Integer.MAX_VALUE;
        final int INT_MIN=Integer.MIN_VALUE;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()){
            return 0;
        }

        int sign=1;

    if(s.charAt(i)=='-'){
        sign=-1;
        i++;
    }else if(s.charAt(i)=='+'){
        i++;
    }

    int res=0;
    while(i<s.length() && Character.isDigit(s.charAt(i))){
        int digit=s.charAt(i)-'0';
        if(res>(INT_MAX-digit)/10){
            if(sign==1){
                return INT_MAX;
            }else{
                return INT_MIN;
            }
        }
        res=res*10+digit;
        i++;
    }
    return res*sign;
    }
}
