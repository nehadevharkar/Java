class MyThread extends Thread {

	public void run(){
		
		System.out.println(Thread.currentThread());
		System.out.println("In thread run ");

		Thread t = currentThread();

		t.setPriority(1);					//priority should 1 or 10 or betweeen 1 to 10
									//min priority = 1
									//max priority = 10
									//default priority = 5
									//if priority is set to less than 1 or greater than 10 then ******************IllegalArgumentException is thrown***************************
		System.out.println(Thread.currentThread());

		try{
			t.setPriority(11);
		}catch(IllegalArgumentException ia){

		}
		System.out.println(Thread.currentThread());
	}
}

class PriorityThread{

	public static void main(String[] args) throws IllegalArgumentException{

		MyThread obj = new MyThread();
		obj.start();

		System.out.println(Thread.currentThread());
		System.out.println("In thread main ");
	}
}
