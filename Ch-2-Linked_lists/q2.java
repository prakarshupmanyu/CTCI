/*
Q -2: Implement an algorithm to find the kth to last element of a singly linked list.
*/

public class q2{
	//k = 1 would return the last element.
	//You can create a function to find out the size
	private node kFromLast(node head, int k, int size){
		if(k <= 0){
			k = 1;	//Added this after reading the solution
		}
		if(k >= size){
			System.out.println("Please enter k value less than the size of linked list");
 			return null;
		}
		int n = size - k, i = 1;
		node cur = head;
		while (i <= n){
			cur = cur.next;
			i++;
		}
		return cur;
	}

	private node bookSolution_Iterative(node head, int k){
		if(k <= 0){
			k = 1;	//Added this after reading the solution
		}
		node p1 = head, p2 = head;
		int i = 0;
		while(i < k){
			if(p1 == null){
				return null;
			}
			p1 = p1.next;
			i++;
		}
		while(p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
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
		
		q2 obj = new q2();
		System.out.println(obj.kFromLast(l, 5, 7).data);
		System.out.println(obj.bookSolution_Iterative(l, 5).data);
	}
}
