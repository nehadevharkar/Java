class Demo1 {

	void fun(int[] arr){

		//changes made in this methid is reflected in main method
		//because both methods are accessing the array of same address
		arr[1] = 70;
		arr[2] = 80;

	}

	public static void main (String[] args){

		int arr[] = {1000,2000,3000,4000};

		for (int x: arr){

			System.out.println (x);
		}

		System.out.println (System.identityHashCode(arr[0]));
                System.out.println (System.identityHashCode(arr[1]));
		System.out.println (System.identityHashCode(arr[2]));
		System.out.println (System.identityHashCode(arr[3]));


		Demo1 obj = new Demo1();
		obj.fun(arr);

		System.out.println (System.identityHashCode(arr[0]));
		System.out.println (System.identityHashCode(arr[1]));
		System.out.println (System.identityHashCode(arr[2]));
		System.out.println (System.identityHashCode(arr[3]));

	}
}

