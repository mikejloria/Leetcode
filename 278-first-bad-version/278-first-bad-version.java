class Solution {
	public int firstBadVersion (int n) {
		int start = 1;
		int end = n;

		while (star < end) {
		int mid = start + (end - start) / 2;
		if (!isBadVersion(mid)) start = mid + 1;
		else end = mid;
		}

		return start;
	}
}
