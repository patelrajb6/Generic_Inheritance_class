import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestQueue {
	static GenericQueue<Integer>demo1;
	static GenericQueue<Integer>demo2;
	


	@BeforeAll
	static void setup()
	{
		demo1 = new GenericQueue<Integer>(3);
		demo2= new GenericQueue<Integer>(0);	
		demo1.enqueue(4);
		demo1.enqueue(5);
		demo1.enqueue(6);
		
	}
	
 
	@Test
	void testdemo1() {
		assertEquals(4,demo1.getlength(),"test1 getlength() 3 element");
		assertEquals(3,demo1.dequeue(),"test1 for dequeue");
	}

}
