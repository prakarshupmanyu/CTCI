/*
This is a linked list class which will provides function for basic LL operations that we would require for this chapter
*/

public class ll{
	public node insertToEnd(node head, int data){
		node cur = head;
		node n = new node(data);
		if(cur == null){
			return n;
		}

		while(cur.next != null){
			cur = cur.next;
		}
		cur.next = n;
		return head;
	}
	
	public void printList(node head){
		node cur = head;
		while(cur != null){
			System.out.print(cur.data+"->");
			cur = cur.next;
		}
		System.out.println();
	}
}
