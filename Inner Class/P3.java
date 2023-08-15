class Anonymous {

	Anonymous course() {

		System.out.println ("Java");
		return obj;
	}
}

class Client {

	public static void main (String[] args){

		Anonymous obj = new Anonymous(){

			Anonymous course () {

				System.out.println ("flutter");
			}
		}.course();

		obj.course();
	}
}
