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
	
	public void insertAtMiddle(int position, int value){
		position=position-1;
		if(position==0){
			insertAtBeginning(value);
			return;
		}
		Node newNode = new Node(value);
		Node temp = head;
		for(int i=1; i<position; i++){
			temp = temp.next;
			if(temp == null){
				position++;
				System.out.println(position+" is an invalid position! Please check it.");
				return;
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void desplay(){
		Node tempNode = head;
		while(tempNode != null){
			System.out.print(tempNode.data + "  ");
			tempNode = tempNode.next;
		}
	}
	public void reverse(){
		Node previous = null;
		Node current = head;
		Node next = head.next;
		
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.insertAtBeginning(2);
		l.insertAtBeginning(3);
		l.insertAtBeginning(5);
		l.insertAtBeginning(6);
		
		l.insertAtMiddle(3,4);
		l.insertAtMiddle(6,1); 
		
		System.out.println("The original linked list :  ");
		l.desplay();
		System.out.println();
		l.reverse();	
		System.out.println("The reversed linked list :  ");
		l.desplay();
	}
}