class Solution {
    public boolean rotateString(String s, String goal) {
        if((s==null || goal==null) || (s.length()!=goal.length()))
        return false;

        if(s.length()==0)
        return true;

        for(int i=0;i<s.length();i++){
            if(rotateString(s,goal,i)){
                return true;
            }
        }
        return false;
    }

    private boolean rotateString(String s,String goal,int rot){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt((i+rot)%goal.length())){
            return false;
        }}
        return true;
   
