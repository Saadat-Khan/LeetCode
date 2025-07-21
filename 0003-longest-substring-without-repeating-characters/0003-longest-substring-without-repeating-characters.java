import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> a = new HashSet<>();
        int maxlength=0;
        int l=0;
        for(int i=0; i<s.length(); i++){
            char b=s.charAt(i);
            while(a.contains(b)){
                a.remove(s.charAt(l));
                l++;
            }
            a.add(b);
            maxlength=Math.max(maxlength, i-l+1);
        }
        return maxlength;
    }
}