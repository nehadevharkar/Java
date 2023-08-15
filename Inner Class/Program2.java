class Outer {

	void fun(){

		System.out.println ("Outer - fun");
	}
}

class Client {

	public static void main (String[] args){

		Outer obj = new Outer(){

			void fun(){

				System.out.println ("Inner - fun");
				m1();
			}

			void m1(){
	
				System.out.println ("Inner - m1");
			}

		};

		obj.fun();

	}
}
