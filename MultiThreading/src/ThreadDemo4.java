//Define Thread by implementing Runnable interface

class MyRunnable1 implements Runnable{
	public void run() {
		System.out.println("child thread");
	}
}
public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread.currentThread().getName() "+Thread.currentThread().getName());
		MyRunnable1 r=new MyRunnable1();
		Thread t=new Thread(r);
		System.out.println("t.getName() "+t.getName());
		t.start();
		//System.out.println("t.getName() "+t.getName());
		for(int i=0;i<10;i++) {
			
			System.out.println("main Thread");
		}
	}
	

		

}


 //Mixed Output
//  Thread.currentThread().getName() main
//  t.getName() Thread-0
//  main Thread
//  main Thread
//  main Thread
//  main Thread 
//  main Thread
//  main Thread
//  main Thread
//  main Thread
//  main Thread
//  main Thread
//  child thread

 