
public class GenericStack<E> extends GenericList<E>{

	@Override
	public void add(E data) {
		Node NewNode= new Node(data);
		if(this.head==null)											 //if the queue is empty
		{
			this.head=NewNode;
		}
		else
		{
			NewNode.next=this.head;
			head=NewNode;
		}
		this.length=this.length+1;
	}
	public void push(E data)
	{
		this.add(data);
	}
	public E pop()
	{
		E PoppedVal= this.delete();
		return PoppedVal;
	}

}
