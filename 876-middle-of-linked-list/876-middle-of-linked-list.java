// public class ListNode () {
// 	int val;
// 	ListNode (int x) {
// 		val = x;
// 		next = null;
// 	}
// }
class MiddleOfLinkedList {
	ListNode middleOfList (ListNode head) {
		ListNode fast = head, slow = head;

		while (head != null && head.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return fast;
	}
}
