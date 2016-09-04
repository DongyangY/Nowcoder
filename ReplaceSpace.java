public class Solution {
    // Time: O(n), Space: O(1)
    public String replaceSpace(StringBuffer str) {
	for (int i = 0; i < str.length(); i++) {
	    if (str.charAt(i) == ' ') {
		str.deleteCharAt(i);
		str.insert(i, "%20");
	    }
	}
	return str.toString();
    }
}
