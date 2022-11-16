import java.util.*;

class IsomorphicStrings {
    public boolean isomorphicStrings (String s, String t) {
        if(s == null || s.length() <= 1) return true;

        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)) {
                if(!map.get(a).equals(b)) return false;
            } else {
                if(!map.containsValue(b)) {
                    //associate the key of a with value of b
                    map.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();
        String s = "egg";
        String t = "add";
        System.out.println(Boolean.toString(solution.isomorphicStrings(s, t)));
    }
}