class Solution {
    public boolean backspaceCompare(String s1, String s2) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        while(i >= 0){
            if(stack1.isEmpty() && s1.charAt(i) != '#'){
                temp1.append(s1.charAt(i));
                i--;
            }else if(!stack1.isEmpty() && (s1.charAt(i) != '#')){
                stack1.pop();
                i--;
            }else{
                stack1.push(s1.charAt(i));
                i--;
            }
        }
        while(j >= 0){
            if(stack2.isEmpty() && s2.charAt(j) != '#'){
                temp2.append(s2.charAt(j));
                j--;
            }else if(!stack2.isEmpty() && (s2.charAt(j) != '#')){
                stack2.pop();
                j--;
            }else{
                stack2.push(s2.charAt(j));
                j--;
            }
        }

        return (temp1.compareTo(temp2) == 0);
    }
}