import java.util.ArrayList;
public class Solution {
    // Time: O(logn), space: O(1)
    public int minNumberInRotateArray(int [] array) {
	if (array.length == 0) return 0;

	int left = 0, right = array.length - 1;

	while (left < right) {
	    // Sorted
	    if (array[left] < array[right]) return array[left];
	    int mid = left + (right - left) / 2;
	    if (array[mid] > array[right]) {
		left = mid + 1;
	    } else if (array[mid] < array[right]) {
		right = mid;
	    } else {
		left++;
	    }
	}

	return array[left];
    }
}
