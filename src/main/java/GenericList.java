
public abstract class GenericList<T> {				// the base singley Linked list 
	Node head;										// reference to the first node in the list
	int length;										// saving the length of the list	
	
	public void add (T data)						// adding the node
	{
		Node NewNode= new Node();				// creating new node
		NewNode.data=data;
		NewNode.next=null;
		
		if(this.head==null)
		{
			this.head=NewNode;
		}
		else
		{
			while(head!=null)
			{
				head=head.next;
			}
		}
	}
	public void delete()							//deleting the node
	{
		
	}
	public void print()								// printing the elements of the list one element per line
	{
		
	}
	private class Node								// Node class which is the single unit of the list
	{
		T data;										// where data is stored
		Node next;									// the address of the next element is stored.
		
	}

}
