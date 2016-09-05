public class Solution {
    // F(n) = F(n - 1) * 1 + F(n - 2) * 1
    // Add one row from f(n - 1) or add two columns from f(n - 2)
    public int RectCover(int target) {
	if (target <= 0) return 0;
	if (target == 1) return 1;
	int pre = 1, cur = 1;
	for (int i = 2; i <= target; i++) {
	    int t = cur;
	    cur += pre;
	    pre = t;
	}
	return cur;
    }
}
