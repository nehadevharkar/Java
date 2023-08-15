class MyThread implements Runnable{

	//compulsory override run()
	public void run(){

		System.out.println("in run");
	}
}

class ThreadDemo{

	public static void main(String[] args){

		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();


	}
}
