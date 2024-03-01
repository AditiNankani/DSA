class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            char nowStart=s.charAt(start);
            char nowEnd=s.charAt(end);
            if(!Character.isLetterOrDigit(nowStart)){
                start++;
            }else if(!Character.isLetterOrDigit(nowEnd)){
                end--;
            }else{
                if(Character.toLowerCase(nowStart)!=Character.toLowerCase(nowEnd)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
