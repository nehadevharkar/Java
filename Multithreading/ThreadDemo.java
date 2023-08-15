import java.util.concurrent.*;

class MyThread implements Runnable {

	int num = 0;
	MyThread(int num){

		this.num = num;
	}

	public void run(){

		System.out.println("Start thread : "+num+" :"+Thread.currentThread());
		dailyTask();
		System.out.println("End thread   : "+num+" :"+Thread.currentThread());
	}

	void dailyTask(){

		try{

			Thread.sleep(50000);

		}catch(InterruptedException e){

		}
	}
}

class ThreadPoolDemo{

	public static void main(String[] args){

		ExecutorService ser1 = Executors.newFixedThreadPool(5);
		ExecutorService ser2 = Executors.newFixedThreadPool(5);

		for(int i=1; i<=10; i++){

			MyThread obj = new MyThread(i);
			ser1.execute(obj);
		}

		for(int i=1; i<=10; i++){

			MyThread obj = new MyThread(i);
			ser2.execute(obj);
		}

		ser1.shutdown();
		ser2.shutdown();
	}
}
