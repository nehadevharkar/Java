class Outer {

	int x = 10;
	int y = 20;

			
	class Inner {
			
		void fun1(){

			System.out.println ("Inner fun");
			System.out.println (x);
			System.out.println (y);
		}

	}

	class Inner2 {

		void fun10(){

			System.out.println ("fun10");
		}

//		System.out.println (this$0);
	}
	

	void fun2(){

		System.out.println ("Outer fun");
	}
}

class Client {

	public static void main (String[] args){

		Outer obj = new Outer();

		Outer.Inner obj1 = obj.new Inner();
		obj1.fun1();

		Outer.Inner2 obj3 = obj.new Inner2();
		obj3.fun10();
	}
}
