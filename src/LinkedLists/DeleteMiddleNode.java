package LinkedLists;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		

		LinkedListNode c = null;

		//Stupid Solution - Used doubly linked list; probably not what was intended
		LinkedListNode prev = c.prev;
		prev.next = c.next;
		c = null;
		
		//one with singly linked list
		LinkedListNode next = c.next;
		c.data = next.data;
		c.next = next.next;
	}

}
