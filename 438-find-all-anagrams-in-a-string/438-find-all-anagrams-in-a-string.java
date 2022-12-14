class Solution {
	public List<Integer> findAnagrams (String s, String p) {
		int[] chars = new int[26];
		List<Integer> result = new ArrayList<>();

		for (char c : p.toCharArray()) {
			char[c-'a']++;
		}
		int start = 0, end = 0, count = p.length();

		while (end < s.length()) {
			if (end - start == p.length() && chars[s.charAt(start++)-'a']++ >= 0) count++;
			if (--chars[s.charAt(end++)-'a'] >= 0) count--;
			if (count == 0) result.add(start);
		}
		return result;
	}
}
