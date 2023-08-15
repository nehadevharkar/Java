class MyThread extends Thread {

	public void run(){

	 	System.out.println("In run1 ");
		//obj.start(); cannot find symbol

		System.out.println(Thread.currentThread());
	}

	/*public void start(){

		System.out.println("Don't override start method because it does not creates new Thread. When obj.start() is invoked from main class, main thread runs and goes to MyThread class and not Thread class, hence no new thread is created");
		
		System.out.println(Thread.currentThread());
	}*/
	
}

class ThreadDemo {

	public static void main (String[] agrs) throws InterruptedException {

		MyThread obj = new MyThread();
		obj.start();
		//obj.start();		throws IllegalThreadStateException

		System.out.println(Thread.currentThread());
		
		
		for(int i=0; i<5; i++){

			System.out.println("In thread main");
			Thread.sleep(200);
		}
	}
}
