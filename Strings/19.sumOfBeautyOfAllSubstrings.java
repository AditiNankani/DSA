/*The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.*/


class Solution {
    public int beautySum(String s) {
        int totBeauty=0;
        for(int i=0;i<s.length();i++){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int j=i;j<s.length();j++){
            char c=s.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);

            int maxFreq=Integer.MIN_VALUE;
            int minFreq=Integer.MAX_VALUE;

            for(int cnt:hm.values()){
                if(cnt>maxFreq){
                    maxFreq=cnt;
                }if(cnt<minFreq){
                    minFreq=cnt;
                }
            }
                totBeauty+=maxFreq-minFreq;
        }
        }
        return totBeauty;
    }
}
