class Solution {
    public String removeOuterParentheses(String s) {
        int len=s.length();
        if(len<=2)
        return "";
        char[] ch=s.toCharArray();
        StringBuilder s1=new StringBuilder();
        int open=1;
        for(int i=1;i<len;i++){
            if(ch[i]=='('){
                open++;
                if(open>1)
                s1.append('(');
            }
            else{
                if(open>1)
                s1.append(')');
                open--;
            }
        }
        return s1.toString();
    }
}
