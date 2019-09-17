
public class GLProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello generic lists");
		GenericQueue<Integer> n1= new GenericQueue<Integer>(4);
		GenericStack<Integer> n2= new GenericStack<Integer>(4);
		n1.enqueue(5);
		//n1.print();
		n1.enqueue(6);
		n1.enqueue(8);
		
		n1.dequeue();
		System.out.println(n1.length);
		//n1.print();
		n2.push(5);
		n2.push(6);
		n2.push(8);
		//n2.print();
		n2.pop();
		//n2.print();
	}

}
