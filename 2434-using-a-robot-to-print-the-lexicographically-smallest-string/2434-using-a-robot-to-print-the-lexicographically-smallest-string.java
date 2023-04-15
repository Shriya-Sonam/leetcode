class Solution {
    public String robotWithString(String s) {
       StringBuilder ans = new StringBuilder();
        Stack<Character> t = new Stack<>();
        char[] schar = s.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) map.put(schar[i], i);
        Arrays.sort(schar);
        
        int cur = -1;
        int i = 0;
        while(i < s.length()){
            char curch = schar[i];//Check current minimum character            
            if(map.get(curch) > cur){//Current char is not in stack  
                while(!t.isEmpty() && t.peek() <= curch) ans.append(t.pop());//Char in stack is smaller than current char, then we add it to answer first
                ans.append(curch);
                for(int j = cur + 1; j < map.get(curch); j++){
                    if(s.charAt(j) == curch){
                        ans.append(curch);
                        i++;
                    }
                    else t.push(s.charAt(j)); //Put in stack
                }
                cur = map.get(curch);
            }
            i++;
        }
         
        //Add left nums in stack to answer
        while(!t.isEmpty()) ans.append(t.pop());        
        return ans.toString(); 
        
    }
}