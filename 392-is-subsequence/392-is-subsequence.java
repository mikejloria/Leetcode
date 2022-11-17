class Subsequence {
/*
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting
 * some (can be none) of the characters without disturbing the relative positions of the remaining
 * characters.
 * 
 * Example 1
 * -------
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */
    public boolean isSubsequence (String s, String t) {
        if(s.length() > t.length()) return false;

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        } 

        return (i == s.length());
    }
    public static void main(String[] args) {
        Subsequence solution = new Subsequence();
        String s = "abc";
        String t = "aefgbwerc";
        System.out.println(Boolean.toString(solution.isSubsequence(s, t)));
    }
}