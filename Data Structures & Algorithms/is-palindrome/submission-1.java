class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character>word = new Stack<>();
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        for(int i = 0; i < s.length(); i ++){
            word.push(s.charAt(i));
        }
        char[] r = new char[s.length()];
        int count = 0;
        while(!word.isEmpty()){
            r[count++]=word.pop();
        }
        String reversed = new String(r);
       
        return reversed.equals(s);
    }
}
