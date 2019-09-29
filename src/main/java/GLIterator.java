import java.util.Iterator;

public class GLIterator<P> implements Iterator<P>{

	
	public GenericList<P>.Node tnode;				//walker to walk through list 
	GLIterator(GenericList<P> list)
	{
		tnode=list.head;								
	}
	
	public  boolean hasNext() {				//overriding the actual behaviour of the list
		
		if(tnode!=null)						//checking if the node is null or not
			return true;
		else
			return false;
		
	}

	
	public P next() {							//return the next element
		P data;
		if (!this.hasNext())
			return null;
       data=tnode.data;
       tnode=tnode.next;
       return data;
		
	}

	
	
	
	
	
	
	

}
