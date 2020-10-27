/*case:4:overloading run method,THread class executes only no arg run method,
other overloaded run method has to be called explicitly*/
class MyThread extends Thread {

	public void run() {
		System.out.println("no arg");
	}

	// should be called explicitly
	public void run(int i) {
		System.out.println("int arg coinstructor");
	}
}

public class ThreadDemo2 {
	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		t1.start();
		t1.run(5);
	}
}

/*
 * OUTPUT: int arg coinstructor no arg
 */
/*
 * case 5:If we don't override the run() in child class,run() method of THread
 * class gets executed, which has empty implementation
 * Highly recommended to override run() method in child class
 */
