package class049;

import java.util.Arrays;

// 无重复字符的最长子串
// 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
// 测试链接 : https://leetcode.cn/problems/longest-substring-without-repeating-characters/
public class Code02_LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String str) {
		char[] s = str.toCharArray();
		int n = s.length;
		int[] last = new int[256];
		Arrays.fill(last, -1);
		int ans = 0;
		for (int l = 0, r = 0; r < n; r++) {
			l = Math.max(l, last[s[r]] + 1);
			ans = Math.max(ans, r - l + 1);
			last[s[r]] = r;
		}
		return ans;
	}

}
