package p1;

/**
 * @author rvoros
 */
public class C3 {
	/**
	* bug L1 bug#1 task#1 
	*/
	public C3() {
		sayHello();
		sayHello2();
	}
	
	/**
	 * issue: #2
	 */
	private void sayHello() {
		System.out.println("hello world");
	}

	private void sayHello2() {
		System.out.println("bla bla");
	}
}
