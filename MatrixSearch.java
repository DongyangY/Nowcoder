public class Solution {
    // Time: O(n), Space: O(1)
    public boolean Find(int [][] array,int target) {
	if (array.length == 0 || array[0].length == 0)
	    return false;

	int m = array.length, n = array[0].length;
	int i = 0, j = n - 1;

	while (i < m && j >= 0) {
	    if (array[i][j] == target) {
		return true;
	    } else if (array[i][j] > target) {
		j--;
	    } else {
		i++;
	    }
	}

	return false;
    }
}
