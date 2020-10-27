//Define thread by extending Thread class
class MyThread1 extends Thread {
	// override run()
	public void run() {
		for (int i = 0; i < 10; i++) {
			// executed by child thread
			System.out.println("child thtread");
		}

	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t = new MyThread1();
		t.start();
//executed by main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
/*
 * Both threads run simultaneaously Output:MIXED output
 * 
 * t.start() executes the thrtead class start method which inturn executes
 * run(). t.start() creates two thread,so we get mixed output.if we call
 * directly the run() as t.run(),it executes as a normal method,ine thread,main
 * thread which is responsible for running the nwhole job
 */