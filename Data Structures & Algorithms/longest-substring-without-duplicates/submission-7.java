class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int l = 0;
        int r = 1;
        int maxL = 1;
        HashMap<Character,Integer>map=new HashMap<>();
        map.put(s.charAt(l),l);
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l, map.get(s.charAt(r)) + 1);
                
                   
            }
            int currentL = r-l+1;
            maxL = Math.max(maxL, currentL);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxL;
    }
}
