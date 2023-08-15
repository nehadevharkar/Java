class MyThread extends Thread {

	public void run(){

		//Thread.sleep(1000);	throws InterruptedException
		

		try{
			Thread.sleep(1000);
		} catch(InterruptedException ie){

		}

		System.out.println(Thread.currentThread());

	}
}

class ThreadDemo{

	public static void main(String[] args){

		MyThread obj = new MyThread();
		obj.start();

		System.out.println(Thread.currentThread());
	}
}
