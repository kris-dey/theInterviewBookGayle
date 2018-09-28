package LinkedLists;

public class Partition {

	public static void main(String[] args) {
		
		LinkedListNode head = null;
		int partition = 5;
		
		LinkedListNode last = null; 
		last = head;
		while(last.next!=null) {
			last = last.next;
		}
		LinkedListNode pt = head;
		while(pt.next!=null) {
			if(pt.data<partition) {
				LinkedListNode tmp = pt; 
				last.next = tmp;
				tmp.next = null;
				
				LinkedListNode next = pt.next; 
				pt.data = next.data;
				pt.next = next.next;
			}	
		}
	}

}
