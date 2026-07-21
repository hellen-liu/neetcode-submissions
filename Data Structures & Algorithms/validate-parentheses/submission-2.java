class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='['||s.charAt(i)=='(' ||s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }
            try{    
                if(s.charAt(i)==']' ||s.charAt(i)==')' ||s.charAt(i)=='}'){
                    char c = stk.pop();
                    if(correspond(c)!=s.charAt(i)){
                        return false;
                    }
                }
            }catch (EmptyStackException e) {return false;}
        }
        if (!stk.isEmpty()) return false;
        return true;
    }
    private Character correspond(char c){
        switch (c){
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return 'n';
            }
    }
}
