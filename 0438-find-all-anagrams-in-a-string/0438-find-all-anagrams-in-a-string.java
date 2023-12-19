class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = search(s,p);
        return result;
    }
    public List<Integer> search(String s, String p) {
        int i =  0;
        int j = 0;
        int K = p.length();
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int l = 0; l < K; l++ ) {
            map.put(p.charAt(l) , map.getOrDefault(p.charAt(l),0)+1);
        }
        int count = map.size();
        int N = s.length();
        while(j < N ) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                val = val - 1;
                map.put(ch,val);
                if (map.get(ch) == 0){
                    count--;
                }
            }
            if (j - i + 1 < K){
                j++;
            }
            else if (j - i + 1 == K){
                if ( count == 0){
                    list.add(i);
                }
                if (map.containsKey (s.charAt(i))) {
                    map.put (s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return list;
    }
}