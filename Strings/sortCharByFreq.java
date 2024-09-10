//
class Solution {
    public String frequencySort(String s) {
      Map<Character,Integer> hm=new HashMap<>();
      for(char c:s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);   //hm.getOrDefault(c, 0) retrieves the current count of c (or 0 if c is not in the map), then adds 1 to it.
      }

      PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a, b)->b.getValue() - a.getValue());
      
//(a, b) -> b.getValue() - a.getValue() specifies that the priority queue should be a max-heap based on frequency. It compares the frequencies of two entries, putting the entry with the higher frequency first.
      
      pq.addAll(hm.entrySet());
      
/*hm.entrySet() returns a set view of the mappings in the map.
pq.addAll() adds all map entries to the priority queue, which then organizes them based on frequency.*/
      
  
      StringBuilder res=new StringBuilder();
      while(!pq.isEmpty()){
        Map.Entry<Character,Integer> entry=pq.poll();
        res.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));

        
        /* String.valueOf(entry.getKey()).repeat(entry.getValue()) creates a string consisting of the character repeated entry.getValue() times and appends it to the result.*/
      }
      return res.toString();
    }
}

