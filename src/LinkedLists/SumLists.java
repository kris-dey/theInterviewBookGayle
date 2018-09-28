package LinkedLists;

public class SumLists {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		LinkedListNode head = null;

		LinkedListNode next = head;

		LinkedListNode n1 = new LinkedListNode(7);
		LinkedListNode n2 = new LinkedListNode(1);
		LinkedListNode n3 = new LinkedListNode(6);

		n1.next = n2;
		n2.next = n3;
		n3.next = null;

		//int result = convertLLtoInt(n1);
		
		int r = 689;

		LinkedListNode resultLL = convertIntToLL(r);
		System.out.println(convertLLtoInt(resultLL));
		
	}

	public static int convertLLtoInt(LinkedListNode head) {
		LinkedListNode next = head;
		int number = 0, multiple = 1;
		while (next != null) {
			number += (next.data * multiple);
			next = next.next;
			multiple *= 10;
		}
		return number;
	}

	public static LinkedListNode convertIntToLL(int result) {
		LinkedListNode head = null, pt = null;
		int run = 1;
		while (result > 0) {
			int n = result % 10;
			result /= 10;
			LinkedListNode node = new LinkedListNode(n);

			if (run == 1) 
				head = node;
			else
				pt.next = node;
			
			pt = node;
			run++;
		}
		return head;
	}

}
