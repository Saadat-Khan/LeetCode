class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String ns="";
        for(int i=s.length()-1; i>=0; i--){
            ns+=s.charAt(i);
        }
        return s.equals(ns);
    }
}