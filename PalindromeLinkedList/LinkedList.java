public class LinkedList{
	
	Node head;
	
	LinkedList(){
		head = null;
	}
	
	class Node{
		int data;
		Node next;
		
		Node(int value){
			data = value;
			next = null;
		}
	}
	
	public void insertAtBeginning(int value){
		Node newNode = new Node(value);
		
		if(head == null){       //WHEN LIST IS EMPTY
			head = newNode;
		}else{               		//WHEN LIST IS NOT EMPTY
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void desplay(){
		Node tempNode = head;
		while(tempNode != null){
			System.out.print(tempNode.data + "  ");
			tempNode = tempNode.next;
		}
	}
	
	public boolean isPalindrome(){
		Node slowNode = head;
		Node fastNode = head;
		
		while(fastNode != null && fastNode.next != null){
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}
		//reverse the last half part of linked list
		Node previous1 = null;
		Node current1 = slowNode;
		Node next = slowNode.next;
		
		while(current1 != null){
			next = current1.next;
			current1.next = previous1;
			previous1 = current1;
			current1 = next;
		}
		slowNode = previous1;
		
		//the first part of linked list
		fastNode = head;
		
		//check is it palindrome or not
		while(slowNode != null){
			if(slowNode.data != fastNode.data){
				return false;
			}
			slowNode = slowNode.next;
			fastNode = fastNode.next;
		}
		return true;
	}
		
	public static void main(String[] args){
		//case1:
		LinkedList l = new LinkedList();
		l.insertAtBeginning(1);
		l.insertAtBeginning(2);
		l.insertAtBeginning(3);
		l.insertAtBeginning(4);
		l.insertAtBeginning(3);
		l.insertAtBeginning(2);
		l.insertAtBeginning(1);
		
		
		
		System.out.println("The linked list1 :  ");
		l.desplay();

		System.out.println();
		if(l.isPalindrome())
			System.out.println("It's a palindrome");
		else
			System.out.println("It's not a palindrome");
		System.out.println();
		System.out.println("-------------------------------------");
		
		//Case2: 
		LinkedList l2 = new LinkedList();
		l2.insertAtBeginning(1);
		l2.insertAtBeginning(2);
		l2.insertAtBeginning(3);
		l2.insertAtBeginning(3);
		l2.insertAtBeginning(2);
		l2.insertAtBeginning(1);
	
		System.out.println("The linked list2 :  ");
		l2.desplay();

		System.out.println();
		if(l2.isPalindrome())
			System.out.println("It's a palindrome");
		else
			System.out.println("It's not a palindrome");
		System.out.println();
		System.out.println("-------------------------------------");
		
		//case3:  
		LinkedList l3 = new LinkedList();
		l3.insertAtBeginning(1);
		l3.insertAtBeginning(2);
		l3.insertAtBeginning(3);
		l3.insertAtBeginning(3);
		l3.insertAtBeginning(1);
	
		System.out.println("The linked list3 :  ");
		l3.desplay();

		System.out.println();
		if(l3.isPalindrome())
			System.out.println("It's a palindrome");
		else
			System.out.println("It's not a palindrome");
	}
}