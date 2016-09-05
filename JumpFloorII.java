public class Solution {
    // S(n) = A(n) + S(n - 1)
    // A(n) = S(n - 1) + 1
    public int JumpFloorII(int target) {
	if (target <= 0) return 0;
	if (target == 1) return 1;
	int sum = 1, cur = 1;
	for (int i = 2; i <= target; i++) {
	    cur = sum + 1;
	    sum += cur;
	}
	return cur;
    }
}
