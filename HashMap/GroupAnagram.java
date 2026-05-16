/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
*/
import java.util.*;
class GroupAnagram{
    //With sorting 
    public static String getSorted(String s){ //T.C - 0(logn)
        char[] charStr = s.toCharArray();
        Arrays.sort(charStr);

        String sorted = new String(charStr);

        return sorted;
    }
    public static ArrayList<ArrayList<String>> groupAnagram(String[] strs){
        HashMap<String, ArrayList<String>> map = new HashMap<>(); //0(n)
        for(String str: strs){
            String sorted = getSorted(str); //0(nlogn)

            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                map.put(sorted, new ArrayList<>());
                map.get(sorted).add(str);
            }
        }

        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        for(String s : map.keySet()){
            ans.add(map.get(s));
        }

        return ans;
    
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        ArrayList<ArrayList<String>> ans = groupAnagram(strs);

        for(int i = 0; i < ans.size(); i++){
            for(int j = 0; j < ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }
}