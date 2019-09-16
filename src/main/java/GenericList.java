
public abstract class GenericList<T> {				// the base singly Linked list 
	Node head;										// reference to the first node in the list
	int length=0;										// saving the length of the list	
	
	public abstract void add (T data);						// adding the node
	public T delete()							//deleting the node
	{
		T DeletedVal;
		DeletedVal=this.head.data;				//storing the data of the first node before deleting
		
		this.head=this.head.next;				//moving the reference to the second node in the list
		this.length=this.length-1;
		return DeletedVal;						
	}
	public void print()								// printing the elements of the list one element per line
	{
		Node iter= this.head;
		while(iter!=null)
		{
			System.out.println(iter.data);
			iter=iter.next;
		}
		
	}
	public  class Node								// Node class which is the single unit of the list
	{
		T data;										// where data is stored
		Node next;									// the address of the next element is stored.
		Node(T val)
		{
			this.data=val;
			this.next=null;
		}
	}

}
