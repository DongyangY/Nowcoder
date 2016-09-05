public class Solution {
    public int Fibonacci(int n) {
	if (n <= 0) return 0;
	if (n == 1) return 1;
	int pre = 0, cur = 1;
	for (int i = 2; i <= n; i++) {
	    int t = cur;
	    cur += pre;
	    pre = t;
	}
	return cur;
    }
}
