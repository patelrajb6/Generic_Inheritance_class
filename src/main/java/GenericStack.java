
public class GenericStack<E> extends GenericList<E>{

	GenericStack(E data)												//Constructor
	{
		this.add(data);
	}
	public void add(E data) {
		Node NewNode= new Node(data);
		if(this.head==null)											  	//if the stack is empty
		{
			this.head=NewNode;											// add the first element
		}
		else															//add element to the start of the list
		{
			NewNode.next=this.head;										
			head=NewNode;
		}
		this.length=this.length+1;										//increase the length
	}
	public void push(E data)											//push onto the stack
	{
		this.add(data);
	}
	public E pop()														//pop off from the stack and return the value popped
	{
		E PoppedVal= this.delete();
		return PoppedVal;
	}

}
