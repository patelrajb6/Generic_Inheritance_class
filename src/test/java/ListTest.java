import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListTest {
	static GenericStack<Integer>demo1;
	static GenericStack<Integer>demo2;
	


	@BeforeAll
	static void setup()
	{
		demo1 = new GenericStack<Integer>(3);
		demo2= new GenericStack<Integer>(0);	 
	}
	@BeforeEach void add()
	{
		demo1.push(2);
		demo1.push(3);
		//demo1.pop();
		//demo1.pop();
	}
 
	@Test
	void testdemo1() {
		assertEquals(3,demo1.getlength(),"test1 getlength() 3 element");
		
	}
	
	@Test
	void testdemo2() {
		
		assertEquals(1,demo2.getlength(),"test1 getlength() 0 element");
		
	}
	 
	

	

}
