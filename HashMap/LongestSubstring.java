//Given a string s, find the length of the longest substring without duplicate characters.


import java.util.*;

class LongestSubstring{
    public static int solve(String s){
        HashMap<Character, Integer> map = new HashMap<>(); //storing char and last occur index
        int maxLength = 0;
        int l = 0;
        int r = 0;

        while(r < s.length()){
            char curr = s.charAt(r);
            int currLength = 0;
            if(map.containsKey(curr)){
                if(map.get(curr) >= l){
                    l = map.get(curr) + 1;
                }
            }
            map.put(curr, r);
            currLength = r - l + 1;

            maxLength = Math.max(currLength, maxLength);
            r++;
        }

        return maxLength;
    } 
    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = solve(s);
        System.out.print(ans);
    }
}