class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '('){
                brackets.push(')');
            }else if(s.charAt(i) == '{'){
                brackets.push('}');
            }else if(s.charAt(i) == '['){
                brackets.push(']');
            }else if(brackets.isEmpty() || brackets.pop() != s.charAt(i)){
                return false;
            }
        }

        return brackets.isEmpty();
    }
}