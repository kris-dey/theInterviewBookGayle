package LinkedLists;

public class ReturnKthToLast {

	public static void main(String[] args) {
		LinkedListNode head = null;
		
		int k = 5;
		LinkedListNode n = head;
		LinkedListNode kAhead = head;
		
		for(int i=0; i<k; i++)	kAhead = kAhead.next;
		
		while(kAhead!=null) {
			n = n.next;
			kAhead = kAhead.next;
		}
		
		System.out.println(n.data);
		
	}

}
