class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('||i=='{'||i=='['){
                a.push(i);
            }
            else if(i==')'&&!a.isEmpty()&&a.peek()=='('){
                a.pop();
            }
            else if(i=='}'&&!a.isEmpty()&&a.peek()=='{'){
                a.pop();
            }
            else if(i==']'&&!a.isEmpty()&&a.peek()=='['){
                a.pop();
            }
            else{
                return false;
            }
        }
        return a.isEmpty(); 
    }
}