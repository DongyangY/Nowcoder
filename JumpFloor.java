public class Solution {
    // Trans: A(n) = A(n - 1) + A(n - 2)
    // Base case: A(0) = 1, A(1) = 1
    // Time: O(n), space: O(1)
    public int JumpFloor(int target) {
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
