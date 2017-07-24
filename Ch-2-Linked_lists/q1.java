/*
Write code to remove duplicates from an unsorted linked list.

Follow up: How would you solve this problem if a temporary buffer is not allowed?
*/

import java.util.*;

public class q1{
	
	private node removeDuplicates(node head){
		HashSet<Integer> myHash = new HashSet<Integer>();
		node prev = null, cur = head;
		while(cur != null){
			if(myHash.contains(cur.data)){
				prev.next = cur.next;
			}else{
				myHash.add(cur.data);
				prev = cur;
			}
			cur = cur.next;
		}
		return head;
	}

	private node removeDupFollowUp(node head){
		node cur = head;
		while(cur != null){
			node j = cur;
			while(j.next != null){
				if(j.next.data == cur.data){
					j.next = j.next.next;
				}else{
					j = j.next;
				}
			}
			cur = cur.next;
		}
		return head;
	}

	public static void main(String args[]){
		ll llo = new ll();
		node l = llo.insertToEnd(null, 1);
		l = llo.insertToEnd(l, 2);
		l = llo.insertToEnd(l, 2);
		l = llo.insertToEnd(l, 5);
		l = llo.insertToEnd(l, 2);
		l = llo.insertToEnd(l, 3);
		l = llo.insertToEnd(l, 3);
		llo.printList(l);
		q1 obj = new q1();
		//l = obj.removeDuplicates(l);
		l = obj.removeDupFollowUp(l);
		llo.printList(l);
	}
}
