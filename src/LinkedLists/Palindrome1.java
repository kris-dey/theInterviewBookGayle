package LinkedLists;

public class Palindrome1 {

	public static void main(String[] args) {
		
		//Stupid again...assumed it's doubly linked list - too easy like that i suppose
		LinkedListNode head = null;
		
		LinkedListNode last = null;
		while(last.next!=null)
			last.next = last;
		
		LinkedListNode n1 = head;
		LinkedListNode n2 = last;
		Boolean palindrome = true;
		
		while(n1!=n2) {
			if(n1.data!=n2.data) {
				palindrome = true;
			}
			n1 = n1.next;
			n2 = n2.prev;
		}
		
		
		

	}

}
