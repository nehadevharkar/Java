class Outer {

	int a = 10;
	static int b = 20;

	class Inner {

		void fun(){

			System.out.println (a);
			System.out.println (b);
			System.out.println (this);
		}
	}

}

class Client {

	public static void main (String[] args){

		Outer obj = new Outer();

		Outer.Inner obj1 = obj.new Inner();
		obj1.fun();
	}
}
