class Solution {
    public boolean isAnagram(String s, String t) {
        int m = t.length();
        HashMap<Character,Integer> map =  new HashMap<>();
        for ( int j = 0; j < m; j++) {
            map.put(t.charAt(j), map.getOrDefault(t.charAt(j), 0) + 1);
        }
        int n = s.length();
        int count = map.size();
        if (n != m){
            return false;
        }
        for ( int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                val = val - 1;
                map.put (ch, val);
                if(map.get(ch) == 0) {
                    count --;
                }
            }
        }
        if (count == 0){
            return true;
        }
        else {
            return false;
        }
        
    }
}