class MyThread extends Thread{

	MyThread(String str){

		super(str);
	}

	MyThread(){

	}

	public void run(){

		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}

class ThreadDemo {

	public static void main (String[] args){

		MyThread obj = new MyThread("T1");
		obj.start();

		MyThread obj1 = new MyThread("T2");
		obj1.start();

		MyThread obj2 = new MyThread();
		obj2.start();		//error: constructor MyThread in class MyThread cannot be applied to given types;


	}
}
