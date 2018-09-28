package LinkedLists;

import java.util.HashSet;

public class RemoveDups {
	
	public static void main(String[] args) {
		
		

	}
	
	public static void deleteDups(LinkedListNode head) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		LinkedListNode previous = null;
		LinkedListNode n = head;
		
		while(n != null) {
			if(hs.contains(n.data))
				previous.next = n.next;
			else {
				hs.add(n.data);
				previous = n;
			}
			n = n.next;
		}
		
	}

}
