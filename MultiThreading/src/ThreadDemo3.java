class Mythread3 {
	public void start() {
		System.out.println("start thrtead");
	}

	public void run() {
		System.out.println("child thrtead");
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread3 t = new Mythread3();
		t.start();
		System.out.println("main method");
	}

}
/*
 * case 6:overriding start() in child thread. it will never gives chance to
 * execute start() of Thread class.it executes as anormal method, so,the same
 * output is produced on all systems
 * run() will not execute
 * It is not recommended to override start() method of THread class
 */