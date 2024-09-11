class Solution {
    public int maxDepth(String s) {
        int cntDepth=0,maxDepth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                cntDepth++;
                maxDepth=Math.max(maxDepth,cntDepth);
            }else if(c==')'){
                cntDepth--;
            }
        
    }
    return maxDepth;
    }
}
