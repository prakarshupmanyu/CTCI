/*
Implement an algorithm to delete a node in the middle (Le., any node but
the fi rst and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.

EXAMPLE
Input: the node c from the linked list: a -> b -> c -> d -> e -> f
Result: nothing is returned, but the new linked list looks like: a -> b -> d -> e -> f

*/

public class q3{

	private void removeMiddleNode(node head, int val){
		node cur = head, prev = null;
		while(cur != null){
			//Make sure that the current node is not the first and the last
			if (cur != head && cur.next != null){
				if(cur.data == val){
					prev.next = cur.next;
					cur = cur.next;
					continue;
				}
			}
			prev = cur;
			cur = cur.next;
		}
	}

	//I didn't read the question properly. So we are only given the node to delete and not the HEAD
	//So we cannot figure out if the given node is head or not. But if the given node is end of list then we will display an appropriate message
	private boolean bookSolution(node mid){
		if (mid == null || mid.next == null){
			System.out.println("The given node is the end of list. It cannot be deleted.");
			return false;
		}
		node n = mid.next;
		mid.data = n.data;
		mid.next = n.next;
		return true;
	}

	public static void main(String args[]){
		
		ll llo = new ll();
		node l = llo.insertToEnd(null, 1);
		l = llo.insertToEnd(l, 2);
		l = llo.insertToEnd(l, 3);
		l = llo.insertToEnd(l, 5);
		l = llo.insertToEnd(l, 4);
		l = llo.insertToEnd(l, 6);
		l = llo.insertToEnd(l, 7);
		llo.printList(l);

		q3 obj = new q3();
		obj.removeMiddleNode(l, 3);
		llo.printList(l);
	}
}
