private int distincts(String s,int k){
    HashMap<Character,Integer> hm=new HashMap<>();
    int start=0,cnt=0;
    
    for(int end=0;end<s.length();end++){
        hm.put(s.charAt(end),hm.getOrDefault(s.charAt(end),0)+1);
        
        
        while(hm.size()>k){
            hm.put(s.charAt(start),hm.getOrDefault(s.charAt(start),0)-1);
            if(hm.get(s.charAt(start))==0){
                hm.remove(s.charAt(start));
            }
            start++;
        }
        cnt+=end-start+1;
    }
    return cnt;
}
