
import java.util.*;
class ValidAnagram{
    
    public static boolean validAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1 );
        }

        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i) , map.get(t.charAt(i)) - 1);

                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        System.out.print(validAnagram(s, t));
    }
}