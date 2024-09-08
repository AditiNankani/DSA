//Method-1:  Arrays function
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        
        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);
    }
}
//TC:  O(NLogN)


//Method-2: convert them to ascii store in to indices and compare
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        
        int[] cntS=new int[26];
        int[] cntT=new int[26];

        for(char c:s.toCharArray()){
            cntS[c-'a']++;
        }

        for(char c:t.toCharArray()){
            cntT[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(cntS[i]!=cntT[i]){
                return false;
            }
        }
        return true;
    }
}
//TC: O(n)





//Method-3: hashmap 
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        
        Map<Character,Integer> Smap=new HashMap<>();
        Map<Character,Integer> Tmap=new HashMap<>();

        for(char c:s.toCharArray()){
            Smap.put(c,Smap.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            Tmap.put(c,Tmap.getOrDefault(c,0)+1);
        }

        return Smap.equals(Tmap);
    }
}
//TC:O(n)
