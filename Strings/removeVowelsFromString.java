class Solution {
    String removeVowels(String S) {
        StringBuilder res= new StringBuilder(); 
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                res.append(c); 
            }
        }
        return res.toString(); 
    }
}
