/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.*;

public class Solution {
    // Time: O(n), Space: O(1)
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	ArrayList<Integer> result = new ArrayList<>();
	while (listNode != null) {
	    result.add(listNode.val);
	    listNode = listNode.next;
	}
	Collections.reverse(result);
	return result;
    }
}
