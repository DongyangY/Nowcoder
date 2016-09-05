public class Solution {
    // Time: O(n), space: O(n)
    public void reOrderArray(int [] array) {
	if (array.length <= 1) return;
	int[] copy = new int[array.length];
	System.arraycopy(array, 0, copy, 0, array.length);

	int i = 0;
	for (int n : copy) {
	    if (n % 2 != 0) {
		array[i++] = n;
	    }
	}

	for (int n : copy) {
	    if (n % 2 == 0) {
		array[i++] = n;
	    }
	}
    }
}
