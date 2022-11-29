import java.util.HashSet;

class LongestPalindrome {
    // for String problems think about Mapping structures as a possible solution
    // palindrome is a String that can be read the same forward and backward
    // odd and even counts of characters
    public int longPlaindrome (String s) {
        HashSet<Character> hashSet = new HashSet<Character>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i))) {
                hashSet.remove(s.charAt(i));
                count++;
            } else {
                hashSet.add(s.charAt(i));
            }
        }
        if (!hashSet.isEmpty()) {
            return count * 2 + 1;
        }
        return count * 2;
    }

    public static void main (String[] args) {
        LongestPalindrome solution = new LongestPalindrome();
        String s = "aabbccdterf";
        System.out.println(solution.longPlaindrome(s));

    }
}