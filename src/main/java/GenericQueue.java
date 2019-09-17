

public class GenericQueue<I> extends GenericList<I> {				//class inherited from list class and also infers the type

	GenericQueue(I data)											//constructor
	{
		this.add(data);
	}
	public void add(I data) {										//the implementation of the abstract method
		Node NewNode=new Node(data);								//New Node	
		Node temp=head;									// temp Node used as pointer
		if(this.head==null)											//if the queue is empty
		{
			this.head=NewNode;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=NewNode;
		}
		this.length=length+1;
	}
	public void enqueue(I data)
	{
		this.add(data);
	}
	
	public I dequeue ()
	{
		I deletedVal=this.delete();
		return deletedVal;
	}
	
}
